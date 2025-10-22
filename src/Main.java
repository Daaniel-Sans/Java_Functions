import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    // EJ1: Mostrar información de un libro
    static void mostrarLibro (String titulo, String autor, int numPag) {
    // Después de crear la función he escrito los diferentes prints que deberían aparecer al usarse
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPag);
    }

    // EJ2: Devolver la duración media de 3 canciones
    static double duracionMediaCanciones (int segCancion1, int segCancion2, int segCancion3) {
    double media =  (segCancion1 + segCancion2 + segCancion3) / 3.0;
    return media;
    }

    /*EJ3: Devolver tiempo restante de un alquiler en días
    **Nota: Todas aquellas funciones que no sean "void" aparecerán como error hasta que no se introduzca un return** */

    static int diasTiempoRestanteAlquiler (int semanasTotales, int diasTranscurridos) {
    int tiempoTotal = (semanasTotales * 7) - diasTranscurridos;
    return tiempoTotal;
    }



}