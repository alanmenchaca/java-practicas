package javacero;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner jum = new Scanner(System.in);
        String nombre;
        int numUno, numDos, resultado;
        /* Las variables almacenan datos para ser procesados. El nombre identifica 
        de manera única cada variable, asignando un valor a la variable y tomando el
        valor almacenado. */

        System.out.println("¿Cuál es tu nombre?");
        nombre = jum.nextLine();

        System.out.println("Dame el primer valor para tu suma:");
        numUno = jum.nextInt();

        System.out.println("Dame el segundo valor para tu suma:");
        numDos = jum.nextInt();

        resultado = numUno + numDos;

        System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);
    }

}
