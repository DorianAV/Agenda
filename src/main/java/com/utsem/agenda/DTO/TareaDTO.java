package com.utsem.agenda.DTO;

import com.utsem.agenda.Model.Categoria;

import java.time.LocalDate;

public class TareaDTO {
    private String descripcion;
    private LocalDate fechaCreacion;
    private LocalDate fechaVencimiento;
    private Byte estado;



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


}
