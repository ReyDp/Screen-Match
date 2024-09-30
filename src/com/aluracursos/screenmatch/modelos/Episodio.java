package com.aluracursos.screenmatch.modelos;

import com.aluracurson.screenmatch.calculos.Calificacion;

public class Episodio implements Calificacion {
    private int numeroEpisodio;
    private String nombreEpisodio;
    private Series serie;
    private int totalVisualizaciones;

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }
    public void setEpisodios(Series serie, String nombreEpisodio, int numeroEpisodio, int totalVisualizaciones) {
        this.serie = serie;
        this.numeroEpisodio = numeroEpisodio;
        this.nombreEpisodio = nombreEpisodio;
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public Series getSerie() {
        return serie;
    }

    public String getNombreEpisodio() {
        return nombreEpisodio;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    @Override
    public double getCalificacion() {
        if(totalVisualizaciones > 100) {
            return 4;
        }else {
            return 2;
        }
    }
}
