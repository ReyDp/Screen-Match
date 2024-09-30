package com.aluracursos.screenmatch.modelos;

import com.aluracurson.screenmatch.calculos.Calificacion;

public class Pelicula extends Titulo implements Calificacion {
    private String director;
    private String durancioEnMinutos;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director, String durancioEnMinutos) {
        this.director = director;
        this.durancioEnMinutos = durancioEnMinutos;
    }

    @Override
    public int getCalificacion() {
        return (int) calculaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " ("+getFechaDeLanzamiento()+")";
    }
}
