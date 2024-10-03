package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exceptions.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class princioalBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        BuscarPelicula buscarPelicula = new BuscarPelicula();

        while (true){
            System.out.print("Buscar pelicula: ");
            String busqueda = scanner.nextLine();

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            Titulo miTitulo = buscarPelicula.searchMovie(busqueda);

            if(miTitulo != null){
                System.out.println(miTitulo);
                titulos.add(miTitulo);
            }
        }

        scanner.close();
        CreateJson createJson = new CreateJson();
        createJson.writeJsonToFile(titulos);
        System.out.println("Finalizo la ejecucion del programa");
    }
}
