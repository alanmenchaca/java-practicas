package problemas;

import java.util.EnumSet;

// Fig. 8.11: PruebaEnum.java
// Prueba del tipo enum Libro.
public class PruebaEnum {

    public static void main(String[] args) {

        /* Por cada enum, el compilador genera el método static values, el cual devuelve un arreglo
        de las constantes enum, en el orden en el que se declararon. */
        Libro libros = Libro.CCPHTP;

        System.out.println("Todos los libros:");

        // imprime todos los libros en enum Libro
        for (Libro libro : Libro.values()) {
            System.out.printf("%-10s%-45s%s%n", libro, libro.getTitulo(), libro.getAnioCopyright());
        }

        System.out.println("\nMostrar un rango de constantes enum:\n");

        // imprime los primeros cuatro libros
        for (Libro libro : EnumSet.range(Libro.JHTP, Libro.CCPHTP)) {
            /* Se utiliza el método static range de la calse EnumSet (declarada en el paquete java.util)
            para mostrar un rango de las constantes de la enum Libro. El método range recibe dos parámetros
            (la primera y la última constantes enum en el rango) y devuelve un objeto EnumSet que contiene
            todas las constantes comprendidas en el rango, incluyendo a estas dos. */
            System.out.printf("%-10s%-45s%s%n", libro, libro.getTitulo(), libro.getAnioCopyright());
        }

    }
}
