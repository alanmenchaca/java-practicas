package arreglos;

// La clase Scanner se encuentra en el paquete java.util
import java.util.Scanner;

public class ArreglosUDinamicos {

    public static void main(String[] args) {

        // Arreglos Unidimensionales (vectores dinámicos)
        int longitud;
        /* El usuario ingresa cuantas filas tendrá el arreglo y el dato es
        guardado en la sublibrería tipo Scanner (jum).*/
        Scanner jum = new Scanner(System.in);

        System.out.println("¿Cuántos números deseas ingresar?");
        longitud = jum.nextInt();
        // Se declara el arreglo con la longitud puesta por el usuario.
        int[] numeros = new int[longitud];

        /* El índice inicializa con 0.
        condición: si el índice es menor que el número de filas (se lee
        con el método length), se efectuara el for.*/
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Porfavor dame el valor #" + (i + 1) + ":");
            // El usuario le asigna un valor a cada vector, ascendiemntemente.
            numeros[i] = jum.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]");
        }

    }

}
