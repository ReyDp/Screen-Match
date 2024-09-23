package com.aluracurson.screenmatch.calculos;

public class Recomendaciones {
    public  void filtra(Calificacion calificacion){
        if(calificacion.getCalificacion() >= 4){
            System.out.println("Bien evaluado por el publico");
        } else if(calificacion.getCalificacion() <= 2){
            System.out.println("Aun no tiene muchas referencias");
        }
    }
}
