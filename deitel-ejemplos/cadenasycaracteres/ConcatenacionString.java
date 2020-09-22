package cadenasycaracteres;

// Método concat de String.
public class ConcatenacionString {

    public static void main(String[] args) {

        String s1 = "Feliz";
        String s2 = "Cumpleanios";

        /* El método concat de String concatena dos objetos String (igual que cuando se usa el
        operador +) y devuelve un nuevo objeto String, el cual contiene los caracteres de ambos 
        objetos String originales. */
        System.out.printf("s1 = %s%n2 = %s%n%n", s1, s2);
        System.out.printf("Resultado de s1.concat(s2) = %s%n", s1.concat(s2));
        System.out.printf("s1 despues de la concatenacion = %s%n", s1);
    }
}
