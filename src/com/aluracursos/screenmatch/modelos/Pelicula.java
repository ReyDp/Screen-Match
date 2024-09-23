package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private String durancioEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public void setpelicula (String nombre, int lanzamiento, String duracion, boolean plan) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = lanzamiento;
        this.durancioEnMinutos = duracion;
        this.incluidoEnElPlan = plan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public String getDurancioEnMinutos() {
        return durancioEnMinutos;
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

    public void muestraFichaTecnica(){
        System.out.println("com.aluracursos.screenmatch.modelos.Pelicula: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duración: "+durancioEnMinutos);
        System.out.println("Cantidad de evaluaciones: "+totalEvaluaciones);
        System.out.println("Calificación: "+calculaMedia());
    }

    public void evalua (double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }
    double calculaMedia(){
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}
