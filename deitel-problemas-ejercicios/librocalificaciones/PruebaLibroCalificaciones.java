package librocalificaciones;

// Fig. 7.15: PruebaLibroCalificaciones.java
// PruebaLibroCalificaciones crea un objeto LibroCalificaciones, usando un
// aregllo de calificaciones y después invoca al método procesarCalificaciones
// para analizarlas
public class PruebaLibroCalificaciones {

    public static void main(String[] args) {

        // arreglo de calificaciones de estudiantes
        int[] arregloCalif = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
                "CS101 Introducción a la programación en Java", arregloCalif);

        System.out.printf("Bienvenido al libro de caificaciones para %n%s%n%n",
                miLibroCalificaciones.getNombreDelCurso());

        miLibroCalificaciones.procesarCalificaciones();
    }
}
