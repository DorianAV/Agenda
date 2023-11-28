package com.utsem.agenda.Services;

import com.utsem.agenda.Model.Categoria;
import com.utsem.agenda.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;
    public String nueva(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
        return "Categoria guardada";
    }
    public List<Categoria> mostrar(){
        return categoriaRepository.findAll();
    }

    public String elimina(@RequestBody Categoria categoria){
        Optional<Categoria> pro = categoriaRepository.findById(categoria.getId());
        if(pro.isPresent()) {
            categoriaRepository.delete(pro.get());
            return "Categoria eliminada";
        }
        else {
            return "Categoria no encontrada";
        }

    }
    public String actualiza(@RequestBody Categoria categoria) {
        Optional<Categoria>cat = categoriaRepository.findById(categoria.getId());
        if(cat.isPresent()) {
            Categoria miCat =cat.get();
            miCat.setNombre(categoria.getNombre());
            //cat.get().setNombre(categoria.getNombre());
            return "Categoria actualizada";
        }
        else {
            return "Categoria no encontrada";
        }
    }
}
