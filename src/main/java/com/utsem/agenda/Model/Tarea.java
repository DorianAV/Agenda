package com.utsem.agenda.Model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descripcion;
    @Column
    private LocalDate fechaCreacion;

    @Column
    private LocalDate fechaVencimiento;

    @Column
    private Byte estado;

    @ManyToOne
    private Categoria categorias;

    @ManyToOne
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    public Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
