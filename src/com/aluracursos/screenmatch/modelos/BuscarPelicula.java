package com.aluracursos.screenmatch.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarPelicula {
    private Gson gson;

    public BuscarPelicula() {
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }

    public Titulo searchMovie(String busqueda) {
        try {
            busqueda = URLEncoder.encode(busqueda, "UTF-8");
            String direccion = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=a4ec26f1";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            return new Titulo(miTituloOmdb);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            return null;
        }
    }
}
