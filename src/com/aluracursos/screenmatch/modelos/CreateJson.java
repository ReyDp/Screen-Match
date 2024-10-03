package com.aluracursos.screenmatch.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateJson {
    private Gson gson;
    public CreateJson() {
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public void writeJsonToFile(List<Titulo> titulos) {
        try (FileWriter fileWriter = new FileWriter("Peliculas.json")) {
            fileWriter.write(gson.toJson(titulos));
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
