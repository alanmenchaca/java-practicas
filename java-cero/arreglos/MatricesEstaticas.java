package arreglos;

public class MatricesEstaticas {

    public static void main(String[] args) {

        // Arreglos bidimensionales o Matriz (matrices estaticas)
        /* Los arreglos multidimencionales son arreglos que contienen otros
        arreglos. El arreglo bidimensional es el arreglo multidimensional
        más basico. */
        int[][] numeros = new int[2][2];

        /* Los dos índices del arreglo son llamados:
        índice de fila e índice de columna. */
        numeros[0][0] = 5;
        numeros[0][1] = 2;
        numeros[1][0] = 5;
        numeros[1][1] = 2;

        System.out.print("[" + numeros[0][0] + "]");
        System.out.print("[" + numeros[0][1] + "]");
        System.out.print("[" + numeros[1][0] + "]");
        System.out.print("[" + numeros[1][1] + "]");

        /* Otra forma de declarar un arreglo bidimensional:
           int[][] ejemplo = {{1, 2, 3}, {4, 5, 6}}; */
    }

}
