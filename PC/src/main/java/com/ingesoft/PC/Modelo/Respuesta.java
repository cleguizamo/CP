package com.ingesoft.PC.Modelo;

import javax.persistence.*;

@Entity
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "pensamiento_id")
    private Pensamiento pensamiento;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Pensamiento getPensamiento() {
        return pensamiento;
    }

    public void setPensamiento(Pensamiento pensamiento) {
        this.pensamiento = pensamiento;
    }
}
