package com.utsem.agenda.Repository;

import com.utsem.agenda.Model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea,Long> {
}
