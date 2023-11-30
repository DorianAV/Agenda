package com.utsem.agenda.Repository;

import com.utsem.agenda.Model.Categoria;
import com.utsem.agenda.Model.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Optional<Categoria> existsCategoriasByColorOrNombre(String color, String nombre);

    Optional<Categoria> findByColor (String color);
}
