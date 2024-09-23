public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Sherlock Holmes";
        miPelicula.fechaDeLanzamiento = 2009;
        miPelicula.durancioEnMinutos = "128 min";
        miPelicula.incluidoEnElPlan = true;
        miPelicula.evalua(10);
        miPelicula.evalua(8.8);
        miPelicula.muestraFichaTecnica();

//        Pelicula MiPelicula2 = new Pelicula();
//        MiPelicula2.nombre = "Sherlock Holmes: Juego de Sombras";
//        MiPelicula2.fechaDeLanzamiento = 2011;
//        MiPelicula2.durancioEnMinutos = "129 min";
//        MiPelicula2.incluidoEnElPlan = true;
//        MiPelicula2.muestraFichaTecnica();
    }
}
