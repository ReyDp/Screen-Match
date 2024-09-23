package com.aluracursos.screenmatch.modelos;

public class Series extends Titulo {

    int temporadas;
    int espisodiosPorTemporada;
    String minutosPorEpisodio;

    public void setinfoSeries (int temporadas, int espisodiosPorTemporada, String minutosPorEpisodio){
        this.temporadas = temporadas;
        this.espisodiosPorTemporada = espisodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public int getEspisodiosPorTemporada() {
        return espisodiosPorTemporada;
    }
    public String getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

}
