package com.utsem.agenda.Services;

import com.utsem.agenda.DTO.UsuarioDTO;
import com.utsem.agenda.Model.Usuario;
import com.utsem.agenda.Repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    ModelMapper mapper;

    public boolean Logged(HttpSession session, @RequestBody UsuarioDTO usuarioDTO) {
        System.out.println(session.getId());
        Optional<Usuario> user = usuarioRepository.findByUsuarioAndContraseña(usuarioDTO.getUsuario(), usuarioDTO.getContraseñaLogin());
        if (user.isPresent()) {
            session.setAttribute("Usuario", usuarioDTO.getUsuario());
            System.out.println(session.getAttribute("Usuario") + " creado");
            return true;
        } else {
            return false;
        }
    }

    public boolean isLogged(HttpSession session){
        System.out.println(session.getId());
        if (session.getAttribute("Usuario")==null){
            System.out.println(session.getAttribute("Usuario"));
            return false;
        }
        else return true;
    }

    public String registro(@RequestBody Usuario usuario) {
        Optional<Usuario> username = usuarioRepository.findByUsuario(usuario.getUsuario());
        if (username.isEmpty()){
            try {
                usuarioRepository.save(usuario);
                return "Registro exitoso"; // Retorna true si se guardó correctamente
            } catch (Exception e) {
                // Puedes imprimir la excepción o manejarla de alguna otra manera
                e.printStackTrace();
                return "Hubo un error al realizar el registro"; // Retorna false si hubo un error al guardar
            }
        }
        else return "Ya hay una cuenta con ese usuario";
    }
}
