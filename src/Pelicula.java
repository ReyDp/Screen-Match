public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    String durancioEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones;
    int totalEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("Pelicula: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duración: "+durancioEnMinutos);
        System.out.println("Cantidad de evaluaciones: "+totalEvaluaciones);
        System.out.println("Calificación: "+calculaMedia());
    }

    void evalua (double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }
    double calculaMedia(){
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}
