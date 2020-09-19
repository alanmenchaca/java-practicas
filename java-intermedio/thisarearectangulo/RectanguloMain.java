package thisarearectangulo;

import java.util.Scanner;

public class RectanguloMain {

    public static void main(String[] args) {
        
        Scanner jum = new Scanner(System.in);
        
        System.out.print("Dame el valor de la base: ");
        int base = jum.nextInt();
        
        System.out.print("Dame el valor de la altura: ");
        int altura = jum.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        
        mensajero.imprimir();
    }

}
