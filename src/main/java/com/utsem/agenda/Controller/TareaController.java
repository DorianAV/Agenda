package com.utsem.agenda.Controller;

import com.utsem.agenda.DTO.TareaDTO;
import com.utsem.agenda.DTO.UsuarioDTO;
import com.utsem.agenda.Services.TareaService;
import com.utsem.agenda.Services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tareas")
public class TareaController {

    @Autowired
    TareaService tareaService;

    @PostMapping("guardarTarea")
    public String guardarTarea(HttpSession session,@RequestBody TareaDTO tareaDTO) {
        return tareaService.guardaTarea(session,tareaDTO);
    }
}
