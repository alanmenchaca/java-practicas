package cadenasycaracteres;

// Los métodos equals, equalsIgnoreCase, compareTo y regionMatches de String.
public class CompararCadenas {

    public static void main(String[] args) {

        String s1 = new String("hola"); // si es una copia de "hola".
        String s2 = "adios";
        String s3 = "Feliz cumpleanios";
        String s4 = "feliz cumpleanios";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);

        // prueba la igualdad
        if (s1.equals("hola")) { // true
            System.out.println("s1 es igual a \"hola\"");
        } else {
            System.out.println("s1 no es igual a \"hola\"");
        }

        // prueba la igualdad con ==
        if (s1 == "hola") { // false; no son el mismo objeto
            System.out.println("s1 es el mismo objeto que \"hola\"");
        } else {
            System.out.println("s1 no es el mismo objeto que \"hola\"");
        }

        // prueba la igualdad (ignora el uso de mayúsculas/minúsculas)
        if (s3.equalsIgnoreCase(s4)) { // true
            /* El método equalsIgnoreCase ignora si las letras en cada objeto String son mayúsculas
            o minúsculas al realizar la comparación. */
            System.out.printf("%s es igual a %s si se ignora el uso de mayúsculas/minúsculas%n", s3, s4);
        } else {
            System.out.println("s3 no es igual a s4");
        }

        // prueba compareTo
        System.out.printf("%ns1.compareTo(s2) es %d", s1.compareTo(s2));
        /* El método compareTo() devuelve 0 si los objetos String son iguales, devuelve un número negativo
        si el objeto String que invoca a compareTo es menor que el objeto String que se pasa como
        argumento, o devuelve un número positivo si el objeto String que invoca a compareTo es mayor que
        la cadena que se pasa como argumento. */
        System.out.printf("%ns2.compareTo(s1) es %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) es %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) es %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) es %d", s4.compareTo(s3));

        // prueba con regionMatches (sensible a mayúsculas/minúsculas)
        if (s3.regionMatches(0, s4, 0, 5)) {
            /* El primer argumento es el índice inicial en el objeto String que invoca al método. El segundo
            argumento es un objeto String de comparación. El tercer argumento es el índice inicial en el objeto String
            de comparación. El último argumento es el número de caracteres a comparar entre los dos objetos String.
            El método devuelve true solamente si el número específicado de caracteres son lexicográficamente iguales. */
            System.out.println("Los primeros 5 caracteres de s3 y s4 coinciden.");
        } else {
            System.out.println("\n\nLos primeros 5 caracteres de s3 y s4 no coinciden.");
        }

        // prueba con regionMatches (ignora el uso de mayúsculas/minúsculas)
        if (s3.regionMatches(true, 0, s4, 0, 5)) {
            /* Cuando el primer argumento es true, el método ingora el uso de mayúsculas y minúsculas en los caracteres
            que se van a comparar. */
            System.out.println("Los primeros 5 caracteres de s3 y s4 coinciden ignorando uso de "
                    + "mayúsculas/minúsculas");
        } else {
            System.out.println("Los primeros 5 caracteres de s3 y s4 no coinciden ignorando uso de "
                    + "mayúsculas/minúsculas");
        }
    }
}
