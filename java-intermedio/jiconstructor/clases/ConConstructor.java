package clases;

import java.util.Scanner;

public class ConConstructor {

    /* En Java, podermos definir un método que se ejecute inicialmente y de manera automática.
    " A este método se le llama constructor ". */
    public ConConstructor() {

        Scanner entrada = new Scanner(System.in);
        String nombre = "";

        System.out.print("¿Cuál es tu nombre?: ");
        nombre = entrada.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);

    }
}
