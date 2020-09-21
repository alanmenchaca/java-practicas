package problemas;

// Fig. 7.21: InicArreglo.java
// Uso de los argumentos de línea de comandos para inicializar un arreglo.
public class InicArreglo {

    public static void main(String[] args) {

        // comprueba el número de línea de comandos
        if (args.length != 3) {
            System.out.println("Error: Vuelva a escribir el comando completo, incluyendo\n"
                    + "el tamaño del arreglo, el valor inicial y el incremento.");
        } else {
            // obtiene el tamaño del arreglo del primer argumento de línea de comandos
            int longitudArreglo = Integer.parseInt(args[0]);
            int[] arreglo = new int[longitudArreglo];

            // obtiene el valor inicial y el incremento de los argumentos de línea de comandos
            int valorInicial = Integer.parseInt(args[1]);
            int incremento = Integer.parseInt(args[2]);

            // calcula el valor para cada elemento del arreglo 
            for (int contador = 0; contador < arreglo.length; contador++) {
                arreglo[contador] = valorInicial + incremento * contador;
            }

            System.out.printf("%s%8s%n", "Indice", "Valor");

            // Muestra el índice y el valor del arreglo
            for (int contador = 0; contador < arreglo.length; contador++) {
                System.out.printf("%5d%8d%n", contador, arreglo[contador]);
            }
        }
    }

}
