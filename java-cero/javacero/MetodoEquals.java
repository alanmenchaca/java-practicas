package javacero;

import java.util.Scanner;

public class MetodoEquals {

    public static void main(String[] args) {

        String nombreUno, nombreDos;
        Scanner jum = new Scanner(System.in);

        System.out.println("Porfavor ingresa el primer nombre:");
        nombreUno = jum.nextLine();

        System.out.println("\nPorfavor ingresa el segundo nombre:");
        nombreDos = jum.nextLine();

        /* El método ".equalsIgnoreCase" (booleano) compara dos cadenas de textos, sin tomar
            en cuenta o sin diferenciar las mayúsculas. */
        if (nombreUno.equalsIgnoreCase(nombreDos)) {
            System.out.println("Los nombre son iguales");
        } else {
            System.out.println("Los nombres son diferentes.");
        }

    }
    
}
