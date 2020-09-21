package problemasdeitel;

import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("  - Ferretería -\nNúmero de pieza: ");
        String numDP = entrada.next();
        System.out.print("Descripción de la pieza: ");
        String descDP = entrada.next();
        System.out.print("Cantidad de artículos: ");
        int cantidadDP = entrada.nextInt();
        System.out.print("Precio por cada artículo: ");
        double precio = entrada.nextDouble();

        Factura articulo1 = new Factura(numDP, descDP, cantidadDP, precio);

        System.out.println("\n---------------------------");
        System.out.println("    ***  Factura:  ***");
        System.out.print("---------------------------");
        
        System.out.printf("%nNúmero de pieza          : %s%n", articulo1.getNumDP());
        System.out.printf("Descripción de la pieza  : %s%n", articulo1.getDescDP());
        System.out.printf("Cantidad de artículos    : %d%n", articulo1.getCantidadDP());
        System.out.printf("Precio por cada artículo: %.2f%n", articulo1.getPrecio());
        System.out.printf("%nPrecio Total : %.2f%n", articulo1.obtenerMontoFactura());
    }
}
