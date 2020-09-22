package cadenasycaracteres;

// Constructores de la clase String
public class ConstructoresString {

    public static void main(String[] args) {

        // arreglo de caracteres
        char[] arregloChar = {'c', 'u', 'm', 'p', 'l', 'e', ' ', 'a', 'n', 'i', 'o', 's'};
        String s = new String("Hola");

        // usa los constructores de String
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(arregloChar);

//           - El primer argumento toma un arreglo de caracteres.
//           - El segundo argumento específica la posición inicial (el desplazamiento) a partir del
//           se accede a los caracteres en el arreglo.
//           - El tercer argumento específica el número de caracteres (la cuenta) que se van a utilizar
//           en el arreglo. 
        String s4 = new String(arregloChar, 7, 5);

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
    }
}
