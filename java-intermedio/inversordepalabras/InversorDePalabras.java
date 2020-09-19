/* 
 * Creado por Alan
 * Versión 1.0
 * Creado el 10/03/2019
 */
package inversordepalabras;

import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner jum = new Scanner(System.in);

        System.out.print("Escribe una palabra o frase: ");
        palabra = jum.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }

        System.out.print("Palabra invertida: " + palabraInvertida);
        System.out.println("");
        
    }

}
