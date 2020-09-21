package ejemplosproblemas;

// Buscar el valor menor
import java.util.Scanner;

public class ValorMenor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numMenor = 0;

        System.out.print("Ingresa el número de iteraciones: ");
        int iteraciones = entrada.nextInt();

        System.out.print("Ingresa el valor 1: ");
        int numero = entrada.nextInt();
        numMenor = numero;

        for (int i = 1; i < iteraciones; i++) {
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            numero = entrada.nextInt();

            if (numero <= numMenor) {
                numMenor = numero;
            }
        }

        System.out.println(numMenor);
    }

}
