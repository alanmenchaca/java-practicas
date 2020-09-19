package javacero;

import java.util.Scanner;

public class MtdLenghtSubstring {

    public static void main(String[] args) {

        String cadenaOriginal, cadenaSubstraccion;
        int numCaracteres, desde, hasta;
        Scanner jum = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres:");
        cadenaOriginal = jum.nextLine();

        /* Método lenght (longitud): Indica cuantos caracteres posee una cadena de caracteres
        tambien indica cual es la longitud de un arreglo. */
        numCaracteres = cadenaOriginal.length();
        /* Para invocar un método, se agrega un punto enseguida de la variable y
        despues se escribe el método a utilizar. */
        System.out.println("\nLa cadena de caracteres: " + cadenaOriginal + " posee "
                + numCaracteres + " caracteres.");

        System.out.print("¿Desde que caracter deseas obtener la nueva cadena?: ");
        desde = jum.nextInt();

        System.out.print("¿Hasta que caracter deseas obtener la nueva cadena?: ");
        hasta = jum.nextInt();

        // Método substring (Subcadena): Permite obtener una parte en específico de la cadena de caracteres. substring(desde, hasta);
        cadenaSubstraccion = cadenaOriginal.substring(desde, hasta);
        System.out.println("La nueva cadena es: " + cadenaSubstraccion);
    }

}
