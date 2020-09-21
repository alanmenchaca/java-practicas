package problemasdeitel;

// Fig. 4.12: Analisis.java
// Analisis de los resultados de un examen, utilizando las intrucciones de control
// anidadas.
import java.util.Scanner; // esta clase utiliza la clase Scanner

public class Analisis {

    public static void main(String[] args) {

        // crea objeto Scanner para obtener entrada en la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        // inicialización de las variables en declaraciones
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;

        // procesa 10 estudiantes, usando ciclo controlado por contador
        while (contadorEstudiantes <= 10) {

            // pide al usuario la entrada y obtiene el valor
            System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
            int resultado = entrada.nextInt();

            // if...else anidado en la instrucción while
            if (resultado == 1) {
                aprobados = aprobados + 1;
            } else {
                reprobados = reprobados + 1;
            }

            // incrementa el contadorEstudiantes, para que el ciclo termine en un momento dado.
            contadorEstudiantes = contadorEstudiantes + 1;
        }

        // fase de terminación: prepara y muestra los resultados
        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

        // determina si más de 8 estudiantes aprobaron
        if (aprobados > 8) {
            System.out.println("Bono para el instructor!");
        }
    }
}
