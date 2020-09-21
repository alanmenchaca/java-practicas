package problemasdeitel;

// Como resolver el problema del promedio de una clase mediante la repetición
// controlada por el centinela.
import java.util.Scanner; // El programa usa la clase Scanner.

public class PromedioClase {

    public static void main(String[] args) {

        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        // fase de inicialización
        int total = 0; // inicializa la suma de calificaciones
        int contadorCalificaciones = 0; // Inicializa # de calificaciones introducidas
        // hasta ahora

        // fase de procesamiento
        // pideentrada y lee calificación del usuario
        System.out.print("Escriba la calificación o -1 para terminar: ");
        int calificacion = entrada.nextInt();

        while (calificacion != -1) {
            total = total + calificacion; // suma calificacion al total
            contadorCalificaciones = contadorCalificaciones + 1; // incrementa el contador

            // pide entrada y lee la siguiente califiación del usuario
            System.out.print("Escriba la calificación o -1 para terminar: ");
            calificacion = entrada.nextInt();
        }

        // fase de terminación
        // si el usuario introdujo al menos una calificación...
        if (contadorCalificaciones != 0) {

            // usa número con punto decimal para calcular promedio de califiaciones.
            double promedio = (double) total / contadorCalificaciones;

            // muestra total y promedio (con dos dígitos de precisión)
            System.out.printf("%nEl total de las %d calificaciones introducidad es %d%n",
                    contadorCalificaciones, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);
        } else {
            // no se introdujeron calificaciones, por lo que muestra el mensaje apropiado
            System.out.println("No se introdujeron calificaciones.");
        }
    }
}
