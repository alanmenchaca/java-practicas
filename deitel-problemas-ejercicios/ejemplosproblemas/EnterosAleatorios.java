package ejemplosproblemas;

// Fig. 6.6: EnterosAleatorios.java
// Enteros aleatorios desplazados y escalados
import java.security.SecureRandom;

public class EnterosAleatorios {

    public static void main(String[] args) {

        // El objeto numerosAleatorios producirá números aletorios seguros
        SecureRandom numerosAleatorios = new SecureRandom();

        // itera 20 veces
        for (int contador = 1; contador <= 20; contador++) {

            // elige entero aletorio de 1 al 6
            // El argumento 6 (que se conoce como valor escala) representa el
            // número de valores únicos que nextInt debe producir (en este caso
            // seis: 0, 1, 2, 3, 4, y 5).
            int cara = 5 + numerosAleatorios.nextInt(6);
            // El valor de desplazamiento (1) especifica el primer valor en el
            // rango deseado de enteros aleatorios. La instrucción anterior asigna
            // a cara un entero aleatorio en el rango de 1 a 6.

            System.out.printf("%d  ", cara); // muestra el valor generado

            // si el contador es divisible entre 5, empieza una nueva línea de salida.
            if (contador % 5 == 0) {
                System.out.println();
            }
        }
    }
}
