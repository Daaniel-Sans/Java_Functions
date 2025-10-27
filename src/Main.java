public class Main {
    public static void main(String[] args) {
        //Llamada de prueba para verificar que he corregido correctamente el error de cálculo del ej4
        calcularImpuestoYDescuento(100.0, 21, 10);
    }
    // EJ1: Mostrar información de un libro
    static void mostrarLibro (String titulo, String autor, int numPag) {
    // Después de crear la función he escrito los diferentes prints que deberían aparecer al usarse ésta
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPag);
    }

    // EJ2: Devolver la duración media de 3 canciones
    static double duracionMediaCanciones (int segCancion1, int segCancion2, int segCancion3) {
    double media =  (segCancion1 + segCancion2 + segCancion3) / 3.0;
    return media;
    }

    /*EJ3: Devolver tiempo restante de un alquiler en días
    **Nota: Todas aquellas funciones que no sean "void" aparecerán como error hasta que no se introduzca un return** */

    static int tiempoRestanteAlquiler (int semanasTotales, int diasTranscurridos) {
    int tiempoTotal = (semanasTotales * 7) - diasTranscurridos;
    return tiempoTotal;
    }

    //EJ4: Mostrar precio con impuesto y descuento
    static void calcularImpuestoYDescuento (double precio, int impuesto, int descuento) {
    double precioConImpuesto = (precio * impuesto / 100.0) + precio;
    double precioConDescuento = precioConImpuesto - (precioConImpuesto * descuento / 100.0) ;
        System.out.println("Precio Original: " + precio + "€");
        System.out.println("Impuesto " + impuesto + "%");
        System.out.println("Precio con impuesto " + precioConImpuesto + "€");
        System.out.println("Descuento " + descuento + "%");
        System.out.println("Precio con descuento " + precioConDescuento + "€");
    }
    //EJ5:Devolver porcentaje de videojuegos del inventario
    static double porcentajeVideojuegos(int juegos, int totalArticulos) {
        double porcentaje = (juegos * 100.0) / totalArticulos;
        return porcentaje;
    }
}