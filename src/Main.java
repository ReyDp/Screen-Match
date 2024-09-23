import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setdatos("Sherlock Holmes", 2009,  true);
        miPelicula.setDirector("Guy Ritchie","128 minutos");

        miPelicula.evalua(10);
        miPelicula.evalua(8.8);
        miPelicula.evalua(9.7);

        miPelicula.muestraFichaTecnica();

        System.out.println("\n");

        Series miSerie = new Series();

        miSerie.setdatos("House of Dragons",2022,true);
        miSerie.setinfoSeries(2,8,"49 minutos");

        miSerie.evalua(9.8);
        miSerie.evalua(8.7);
        miSerie.evalua(7.9);

        miSerie.muestraFichaTecnica();
    }
}
