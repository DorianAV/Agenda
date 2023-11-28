package com.utsem.agenda.Repository;

import com.utsem.agenda.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
