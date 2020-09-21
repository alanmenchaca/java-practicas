package ejemplosproblemas;

// Fig. 7.7: TirarDado.java
// Programa para tirar dados que utilizan arreglos en vez de switch.
import java.security.SecureRandom;

public class TirarDado {

    public static void main(String[] args) {

        SecureRandom numerosAleatorios = new SecureRandom();
        int[] frecuencia = new int[7]; // arreglo de contadores de frecuencia

        // tirar el dado 6,000,000 veces usa: el valor del dado como indíce de frecuencia.
        for (int tiro = 1; tiro <= 6000000; tiro++) {
            /* Se evalúa primero el cálculo dentro de los corchetes para determinar
            qué elemento del arreglo se debe incrementar, y después el operador ++ suma
            uno a ese elemento. */
            ++frecuencia[1 + numerosAleatorios.nextInt(6)];
            // La frecuencia se incrementa en 1, en una posición aleatoria.
        }

        System.out.printf("%s%12s%n", "Cara", "Frecuencia");

        // imprime el valor de cada elemento del arreglo
        for (int cara = 1; cara < frecuencia.length; cara++) {
            System.out.printf("%4d%10d%n", cara, frecuencia[cara]);
        }

    }

}
