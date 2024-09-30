package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class principalConListas {
    public static void main(String[] args) {

        var peliculaNueva = new Pelicula("Intensamente", 2024);
        peliculaNueva.evalua(8);
        Pelicula miPelicula = new Pelicula("Sherlock Holmes", 2009);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Sherlock Holmes: Juego de sombras", 2011);
        otraPelicula.evalua(9);
        Series miSerie = new Series("House of Dragons", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaNueva);
        lista.add(miSerie);

        for (Titulo item : lista){
            System.out.println(item.getNombre());
            if(item instanceof Pelicula pelicula){
                System.out.println("Calificacion: "+pelicula.getCalificacion()+" Estrellas"+"\n");
            }
        }
        System.out.println("\n");

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Robert Downey Jr.");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Milly Alcock");
        listaDeArtistas.add("Angelina Jolie");

        System.out.println("Lista de artistas no ordenada: "+listaDeArtistas+"\n");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenados: "+listaDeArtistas+"\n");

        Collections.sort(lista);
        System.out.println("Nombre de peliculas ordenados: "+lista);
    }
}
