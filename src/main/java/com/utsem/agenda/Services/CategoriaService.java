package com.utsem.agenda.Services;

import com.utsem.agenda.DTO.CategoriaDTO;
import com.utsem.agenda.Model.Categoria;
import com.utsem.agenda.Repository.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    ModelMapper mapper;

    public String nueva(@RequestBody Categoria categoria) {
        Optional<Categoria> existingCategoria = categoriaRepository.findByColorOrNombre(categoria.getColor(), categoria.getNombre());
        System.out.println(existingCategoria + "Cat");
        if (existingCategoria.isPresent()) {
            return "La categoría ya existe";
        } else {
            categoriaRepository.save(categoria);
            return "Categoría guardada";
        }
    }

    public List<CategoriaDTO> mostrar(){
        List<Categoria> categorias = categoriaRepository.findAll();
        List<CategoriaDTO> categoriaDTOs = categorias.stream()
                .map(categoria -> mapper.map(categoria, CategoriaDTO.class))
                .collect(Collectors.toList());
        return categoriaDTOs;
    }
}
