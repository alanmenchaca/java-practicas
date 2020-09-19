package javacero;

// Compara enteros utilizando if, operadores relacionales
// y de igualdad
import java.util.Scanner; // el programa utiliza la clase Scanner

public class Comparacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1; // primer número a comparar
        int numero2; // segundo número a comparar
        
        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario
        
        System.out.print("Escriba el segundo entero: "); //indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario
        
        // Compara los valores de las variables numero1 y numero2, para
        // determinar si son iguales o no.
        if(numero1 == numero2)
            System.out.printf("%d == %d", numero1, numero2);
        
        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);
        
        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);
                
        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);
                        
        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);
                                
        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);
    }
}
