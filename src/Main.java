import com.aluracurson.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracurson.screenmatch.calculos.Recomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Recomendaciones filtro = new Recomendaciones();
        Series miSerie = new Series();
        CalculadoraDeTiempo calcular = new CalculadoraDeTiempo();
        Episodio episodio = new Episodio();

        Pelicula miPelicula = new Pelicula("Sherlock Holmes");
        miPelicula.setdatos( 2009,128,true);
        miPelicula.setDirector("Guy Ritchie","128 minutos");

        miPelicula.evalua(10);
        miPelicula.evalua(8.8);
        miPelicula.evalua(9.7);

        miPelicula.muestraFichaTecnica();
        filtro.filtra(miPelicula);

        System.out.println("\n");

        miSerie.setdatos(2022,49,true);
        miSerie.setInfoSeries(2,8,49);

        miSerie.evalua(9.8);
        miSerie.evalua(8.7);
        miSerie.evalua(7.9);

        miSerie.muestraFichaTecnica();
        episodio.setEpisodios(miSerie,"The Heirs of the Dragon", 1, 300);
        filtro.filtra(episodio);
        int totalVisualizaciones = episodio.getTotalVisualizaciones();

        System.out.println("\n");

        Pelicula otraPelicula = new Pelicula("Sherlock Holmes: Juego de sombras");
        otraPelicula.setdatos( 2011, 129,true);
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

        var peliculaNueva = new Pelicula("Intensamente");
        peliculaNueva.setdatos(2024,124,true);

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
