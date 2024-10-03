package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exceptions.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
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
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){
            System.out.print("Buscar pelicula: ");
            String busqueda = scanner.nextLine();
            busqueda = URLEncoder.encode(busqueda, "UTF-8");

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey=a4ec26f1";

            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println(miTitulo);

                titulos.add(miTitulo);

            } catch (NumberFormatException e)
            {
                System.out.println("Orcurrio un error: "+e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error la URI, Verifique la direccion");
            }catch (ErrorEnConversionDeDuracionException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter fileWriter = new FileWriter("Peliculas.json");
        fileWriter.write(gson.toJson(titulos));
        fileWriter.close();
        System.out.println("Finalizo la ejecucion del programa");
    }
}
