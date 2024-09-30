package com.aluracursos.screenmatch.modelos;

public class Series extends Titulo {

    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    public Series(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public void setInfoSeries(int temporadas, int episodiosPorTemporada, int minutosPorEpisodio) {
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}

