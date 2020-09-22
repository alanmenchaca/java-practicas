package cadenasycaracteres;

// Los métodos startsWith y endsWith de String.
public class CadenaInicioFin {

    public static void main(String[] args) {

        String[] cadenas = {"empezo", "empezando", "termino", "terminando"};

        // prueba el método startsWith
        for (String cadena : cadenas) {

            /* La instrucción if determina si cada objeto String en el arreglo empieza con los
            caracteres "em". De ser así, el método devuelve true y la aplicación imprime ese objeto
            String. En caso contrario, el método devuelve false y no ocurre nada. */
            if (cadena.startsWith("em")) {
                System.out.printf("\"%s\" empieza con \"em\"%n", cadena);
            }
        }

        System.out.println();

        // prueba el método startsWith empezando desde la posición 2 de la cadena.
        for (String cadena : cadenas) {

            /* La instrucción if determina si cada objeto String en el arreglo tiene los caracteres "pez",
            empezando con el tercer carácter en cada objeto String. De ser así, el método devuelve true. */
            if (cadena.startsWith("pez", 2)) {
                System.out.printf("\"%s\" empieza con \"pez\" en la posicion 2%n", cadena);
            }
        }

        System.out.println();

        // prueba el método endsWith
        for (String cadena : cadenas) {
            /* El método endsWith recibe un argumento String. La condición determina si cada objeto String en
            el arreglo termina con los caracteres "do", de ser así el método devuelve true. */
            if (cadena.endsWith("do")) {
                System.out.printf("\"%s\" termina con \"do\"%n", cadena);
            }
        }
    }
}
