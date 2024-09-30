package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

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
}
