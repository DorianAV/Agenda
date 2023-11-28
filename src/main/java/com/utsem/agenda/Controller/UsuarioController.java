package com.utsem.agenda.Controller;

import com.utsem.agenda.DTO.UsuarioDTO;
import com.utsem.agenda.Model.Usuario;
import com.utsem.agenda.Services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;


    @PostMapping("login")
    public String login(HttpSession session, @RequestBody UsuarioDTO usuarioDTO) {
        System.out.println(usuarioDTO.getUsuario()+usuarioDTO.getContraseñaLogin());
        if (usuarioService.Logged(session, usuarioDTO)==true){
            return "Loggin exitoso, bienvenido "+ session.getAttribute("Usuario");
        }
        else return "Error al iniciar sesión, verifica que el usuario o contraseña sean correctos";
    }
    @PostMapping("isLogged")
    public boolean logged(HttpSession session){
        if(session.getAttribute("Usuario")==null){
            return false;
        }
        else return true;
    }

    @PostMapping("registro")
    public String registro(@RequestBody Usuario usuario) {
        return usuarioService.registro(usuario);
    }

}
