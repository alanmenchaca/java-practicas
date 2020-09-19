package poosuma;

import java.util.Scanner;

public class SumaMain {

    public static void main(String[] args) {

        Scanner jum = new Scanner(System.in);

        System.out.println("Dame el primer valor: ");
        int valorUno = jum.nextInt();

        System.out.println("Dame el segundo valor: ");
        int valorDos = jum.nextInt();

        // Pasar datos a través de argumentos
        POOSuma valores = new POOSuma(valorUno, valorDos);
        /* Para poder envíar los datos a través de un objeto, estos se 
        colocan dentro de los paréntesis. */
        
        // Llamamos a imprimir la operación por medio del objeto creado.
        valores.imprimir();
    }

}
