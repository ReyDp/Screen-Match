import com.aluracurson.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracurson.screenmatch.calculos.Recomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        Recomendaciones filtro = new Recomendaciones();
        Series miSerie = new Series();
        CalculadoraDeTiempo calcular = new CalculadoraDeTiempo();
        Episodio episodio = new Episodio();

        miPelicula.setdatos("Sherlock Holmes", 2009,128,true);
        miPelicula.setDirector("Guy Ritchie","128 minutos");

        miPelicula.evalua(10);
        miPelicula.evalua(8.8);
        miPelicula.evalua(9.7);

        miPelicula.muestraFichaTecnica();
        filtro.filtra(miPelicula);

        System.out.println("\n");

        miSerie.setdatos("House of Dragons",2022,49,true);
        miSerie.setInfoSeries(2,8,49);

        miSerie.evalua(9.8);
        miSerie.evalua(8.7);
        miSerie.evalua(7.9);

        miSerie.muestraFichaTecnica();
        episodio.setEpisodios(miSerie,"The Heirs of the Dragon", 1, 300);
        filtro.filtra(episodio);
        int totalVisualizaciones = episodio.getTotalVisualizaciones();

        System.out.println("\n");

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setdatos("Sherlock Holmes: Juego de Sombras", 2011, 129,true);
        otraPelicula.setDirector("Guy Ritchie","128 minutos");

        otraPelicula.evalua(10);
        otraPelicula.evalua(8.8);
        otraPelicula.evalua(9.7);

        otraPelicula.muestraFichaTecnica();
        filtro.filtra(otraPelicula);

        calcular.incluye(miPelicula);
        calcular.incluye(miSerie);
        calcular.incluye(otraPelicula);
        System.out.println("Tiempo total en minutos para ver todos los titulos: "
                +calcular.getTiempoTotal());

        var peliculaNueva = new Pelicula();
        peliculaNueva.setdatos("Intensamente 2",2024,124,true);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaNueva);

        System.out.println("Tamaño de la lista: "+listaDePeliculas.size());
        System.out.println("La primera pelicula es: "+listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("Pelicula: "+listaDePeliculas.get(0).toString());
    }
}
