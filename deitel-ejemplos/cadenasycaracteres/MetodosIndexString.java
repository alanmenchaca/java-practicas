package cadenasycaracteres;

public class MetodosIndexString {

    public static void main(String[] args) {

        String letras = "abcdefghijklmabcdefghijklm";

        // prueba indexOf para localizar un carácter en una cadena
        System.out.printf("'c' se encuentra en el indice %d%n", letras.indexOf('c'));
        /* El método indexOf recibe dos argumentos enteros: el carácter y el índice inicial en el
        que debe empezar la búsqueda en el objeto String. */
        System.out.printf("'a' se encuentra en el indice %d%n", letras.indexOf('a', 1));
        // El método indexOf localiza la primera ocurrencia de un carácter en un objeto String.
        System.out.printf("'$' se encuentra en el indice %d%n%n", letras.indexOf('$'));
        /* Si el método encuentra el carácter, devuelve el índice de ese carácter en la cadena; en
        caso contrario devuelve -1. */

        // prueba lastIndexOf para buscar un carácter en una cadena.
        System.out.printf("La ultima 'c' se encuentra en el indice %d%n", letras.lastIndexOf('c'));
        /* El método lastIndexOf recibe dos argumentos enteros: la representación entera del carácter y el
        ídice a partir del cual debe iniciarse la búsqueda inversa de ese carácter. */
        System.out.printf("La ultima 'a' se encuentra en el indice %d%n", letras.lastIndexOf('a', 25));
        /* El método lastIndexOf localiza la última ocurrencia de un carácter en un objeto String. El método
         realiza la búsqueda desde el final del objeto String hacía el inicio del mismo. */
        System.out.printf("La ultima '$' se encuentra en el indice %d%n%n", letras.lastIndexOf('$'));

        // prueba indexOf para localizar una subcadena en una cadena
        System.out.printf("\"def\" se encuentra en el indice %d%n", letras.indexOf("def"));
        /* Estas versiones de los métodos se ejecutan en forma idéntica a las descritas anteriormente, excepto
        que buscan secuencias de caracteres (o subcadenas) que se especifican mediante sus argumentos String. Si se
        encuentra la subcadena, estos métodos devuelven el índice en el objeto String del primer carácter
        en la subcadena. */
        System.out.printf("\"def\" se encuentra en el indice %d%n", letras.indexOf("def", 7));
        System.out.printf("\"hola\" se encuentra en el indice %d%n%n", letras.indexOf("hola"));

        // prueba lastIndexOf para buscar una subcadena en una cadena
        System.out.printf("La ultima ocurrencia de \"def\" se encuentra en el indice %d%n", letras.lastIndexOf("def"));
        System.out.printf("La ultima ocurrencia de \"def\" se encuentra en el indice %d%n", letras.lastIndexOf("def", 25));
        System.out.printf("La ultima ocurrencia de \"hola\" se encuentra en el indice %d%n", letras.lastIndexOf("hola"));
    }
}
