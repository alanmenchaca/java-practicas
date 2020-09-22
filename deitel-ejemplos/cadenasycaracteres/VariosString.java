package cadenasycaracteres;

// Esta aplicación muestra los método length, charAt y getChars de la clase String.
public class VariosString {

    public static void main(String[] args) {

        String s1 = "hola a todos";
        char[] arregloChar = new char[5];

        System.out.printf("s1: %s1", s1);

        // el método length() devuelve la longitud de un objeto String.
        System.out.printf("%nLongitud de s1: %d", s1.length());

        // itera a través de los caracteres en si con charAt y muestra la caadena invertida.
        System.out.print("\nLa cadena invertida es: ");
        for (int cuenta = s1.length() - 1; cuenta >= 0; cuenta--) {
            /* El método charAt() obtiene el caracter que se encuentra en una ubicación
            específica de un objeto String. */
            System.out.printf("%c", s1.charAt(cuenta));
        }

        // copia los caracteres de la cadena a arregloChar
        s1.getChars(0, 5, arregloChar, 0);
        /* Se copia la cadena desde el índice 0 hasta el índice 5, el tercer argumento es el arreglo
        de caracteres en donde se van a copiar los caracteres, el último argumento es el índice inicial
        en donde se van a colocar los caracteres copiados en el arreglo de caracteres de destino. */
        System.out.print("\nEl arreglo de caracteres es: ");

        for (char caracter : arregloChar) {
            System.out.print(caracter);
        }

        System.out.println();
    }
}
