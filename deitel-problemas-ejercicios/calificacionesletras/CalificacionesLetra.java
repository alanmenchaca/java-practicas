package calificacionesletras;

// Fig. 5.9: CalificacionesLetra.java
// La clase CalifiacionesLetra usa la instrucción switch para contar las 
// calificaciones de letra.
import java.util.Scanner;

public class CalificacionesLetra {

    public static void main(String[] args) {

        int total = 0; // suma de calificaciones
        int contadorCalif = 0; // número de califiaciones introducidas
        int aCuenta = 0; // cuenta de calificaciones A
        int bCuenta = 0; // cuenta de calificaciones B
        int cCuenta = 0; // cuenta de calificaciones C
        int dCuenta = 0; // cuenta de calificaciones D
        int fCuenta = 0; // cuenta de calificaciones E

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n%s%n    %s%n    %s%n",
                "Introduza las califiaciones en el rango de 0-100",
                "Escriba el indicador de fin de archivo para terminar la entrada:",
                "En UNIX/LINUX/Mac OS X escriba <Ctrl> d y oprima Intro",
                "En Windows esriba <Ctrl> z y oprima Intro.");

        // itera hasta que el usuario introduza el indicador de fin de archivos.
        while (entrada.hasNext()) {
            /* El indicador de fin de archivo es una combinación de teclas dependientes
            del sistema, que el usuario introduce para indicar que no has más datos
            que introducir. */
            int calificacion = entrada.nextInt(); // lee califiación
            total += calificacion; // suma califiación al total
            ++contadorCalif; // incrementa el número de califiaciones

            // incrementa el contador de calificación de letra apropiado.
            switch (calificacion / 10) {
                case 9: // calificacion estaba entre 90
                case 10: // y 100, inclusive.
                    ++aCuenta;
                    break; // sale del switch

                case 8: // califiacion estaba entre 80 y 89
                    ++bCuenta;
                    break; // sale del switch

                case 7: // califiacion estaba entre 70 y 79
                    ++cCuenta;
                    break; // sale del switch

                case 6: // calificacion entre 60 y 69
                    ++dCuenta;
                    break; // sale del switch

                default: // califiacion era menor que 60
                    fCuenta++;
                    break; // opcional: sale del switch de todas formas.
            } // fin de switch
        } // fin de while

        // muestra reporte de calificaciones
        System.out.printf("%nReporte de calificaciones:%n");

        // si el usuario introdujo al menos una calificación...
        if (contadorCalif != 0) {
            // calcula el promedio de todas las califiaciones introducidas
            double promedio = (double) total / contadorCalif;

            // muestra resumen de resultados en pantalla
            System.out.printf("El total de las %d calificaciones introducidas es "
                    + "%d%n", contadorCalif, total);

            System.out.printf("El promedio de la clase es %.2f%n", promedio);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Número de estudiantes que recibierón cada califiación:",
                    "A: ", aCuenta, // Muestra número de califiaciones A
                    "B: ", bCuenta, // Muestra número de califiaciones B
                    "C: ", cCuenta, // Muestra número de califiaciones C
                    "D: ", dCuenta, // Muestra número de califiaciones D
                    "F: ", fCuenta);  // Muestra número de califiaciones F
        } else {
            System.out.println("No se introdujeron calificaciones.");
        }
    }

}
