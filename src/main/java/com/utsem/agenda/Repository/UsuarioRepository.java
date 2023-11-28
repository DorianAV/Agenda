package com.utsem.agenda.Repository;

import com.utsem.agenda.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsuarioAndContraseña(String usuario, String contraseña);


    Optional<Usuario> findByUsuario(String usuario);
}
