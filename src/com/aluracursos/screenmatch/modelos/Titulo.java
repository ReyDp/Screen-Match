package com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setdatos (int duracionEnMinutos, boolean plan) {
        this.incluidoEnElPlan = plan;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }
    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }
    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }
    public double getSumaDeEvaluaciones() {
        return sumaDeEvaluaciones;
    }
    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("Titulo: "+getNombre());
        System.out.println("Fecha de lanzamiento: "+getFechaDeLanzamiento());
        System.out.println("Cantidad de evaluaciones: "+getTotalEvaluaciones());
        System.out.println("Calificación: "+calculaMedia());
        System.out.println("Duración en minutos: "+getDuracionEnMinutos());
    }

    public void evalua (double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }
    double calculaMedia(){
        return getSumaDeEvaluaciones() / getTotalEvaluaciones();
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Fecha De Lanzamiento: " + fechaDeLanzamiento+'\n'+
                "Duracion: "+duracionEnMinutos;
    }
}
