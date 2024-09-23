package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;
    private int duracionEnMinutos;

    public void setdatos (String nombre, int lanzamiento, int duracionEnMinutos, boolean plan) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = lanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.incluidoEnElPlan = plan;
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
