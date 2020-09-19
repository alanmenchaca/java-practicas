package arreglos;

import java.util.Scanner;

public class MatricesDinamicas {

    public static void main(String[] args) {

        // Arreglos bidimensionales o Matriz (matrices dinámicas)
        int filas, columnas, contador = 1;
        Scanner jum = new Scanner(System.in);

        System.out.println("¿Cuántas filas deseas?");
        filas = jum.nextInt();

        System.out.println("¿Cuántas columnas deseas?");
        columnas = jum.nextInt();

        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {

                numeros[j][i] = contador;
                contador++;

                System.out.print("[" + numeros[j][i] + "]");
            }// for j

            System.out.println("");
        }// for i
        
    }

}
