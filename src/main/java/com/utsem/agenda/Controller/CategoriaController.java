package com.utsem.agenda.Controller;

import com.utsem.agenda.DTO.CategoriaDTO;
import com.utsem.agenda.Model.Categoria;
import com.utsem.agenda.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @PostMapping("nueva")
    public String nueva(@RequestBody Categoria categoria) {
        return categoriaService.nueva(categoria);
    }

    @GetMapping("mostrar")
    public List<CategoriaDTO> mostrar(){
        return categoriaService.mostrar();
    }
}
