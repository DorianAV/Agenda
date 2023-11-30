package com.utsem.agenda.Repository;

import com.utsem.agenda.Model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TareaRepository extends JpaRepository<Tarea,Long> {

    List<Tarea> findAllByUser(String user);
}
