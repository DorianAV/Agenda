package com.utsem.agenda.DTO;

import com.utsem.agenda.Model.Categoria;
import jakarta.persistence.Column;

import java.time.LocalDate;

public class TareaDTO {
    private String title;
    private String start;
    private String color;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
