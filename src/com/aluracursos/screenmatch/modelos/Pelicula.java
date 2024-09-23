package com.aluracursos.screenmatch.modelos;

public class Pelicula extends Titulo {
    private String director;
    private String durancioEnMinutos;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director, String durancioEnMinutos) {
        this.director = director;
        this.durancioEnMinutos = durancioEnMinutos;
    }
}
