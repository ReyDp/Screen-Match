import com.aluracursos.screenmatch.modelos.Pelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setpelicula("Sherlock Holmes", 2009, "128 min", true);

        miPelicula.evalua(10);
        miPelicula.evalua(8.8);
        miPelicula.evalua(9.7);

        miPelicula.muestraFichaTecnica();
    }
}
