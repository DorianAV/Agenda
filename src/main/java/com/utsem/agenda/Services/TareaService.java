package com.utsem.agenda.Services;

import com.utsem.agenda.DTO.TareaDTO;
import com.utsem.agenda.Model.Categoria;
import com.utsem.agenda.Model.Tarea;
import com.utsem.agenda.Model.Usuario;
import com.utsem.agenda.Repository.CategoriaRepository;
import com.utsem.agenda.Repository.TareaRepository;
import com.utsem.agenda.Repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TareaService {
    @Autowired
    TareaRepository tareaRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    ModelMapper mapper;
    public String guardaTarea(HttpSession session, TareaDTO tareaDTO){
        Tarea tarea = mapper.map(tareaDTO, Tarea.class);
        tarea.setUser((String) session.getAttribute("Usuario"));
        Optional<Usuario> user =usuarioRepository.findByUsuario((String) session.getAttribute("Usuario"));
        Usuario usuario = user.get();
        tarea.setUsuario(usuario);
        Optional<Categoria> cat = categoriaRepository.findByColor(tareaDTO.getColor());
        Categoria categoria= cat.get();
        tarea.setColor(categoria.getColor());
        tareaRepository.save(tarea);
        return "ProductoGuardado";
    }
}
