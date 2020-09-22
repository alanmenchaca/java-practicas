package manejodeexcepciones;

// Manejo de excepciones ArithmeticException e InputMismatchException
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEntreCeroConManejoDeExcepciones {

    // demuestra cómo se lanza una excpeción cuando ocurre una división entre cero
    public static int cociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador; // posible división entre cero.
    }

    public static void main(String[] args) {

        Scanner explorador = new Scanner(System.in);
        // determina si se necesitan más datos de entrada
        boolean continuarCiclo = true;

        do {
            try { // lee los números y calcula el cociente.
                System.out.print("Introduza un número entero: ");
                int numerador = explorador.nextInt();
                System.out.print("Introduza un denominador entero: ");
                int denominador = explorador.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);

                // entrada exitosa termina el ciclo
                continuarCiclo = false;

            } catch (InputMismatchException inputMismatchException) {

                // objeto System.err (flujo de error estándar).
                System.err.printf("%nExcepcion: %s%n", inputMismatchException);

                // descarta entrada para que el usuario intente otra vez.
                explorador.nextLine();

                // objeto System.out (flujo de salida estándar).
                System.out.println("Debe introducir enteros. Intente de nuevo.\n");

            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nExcepcion: %s%n", arithmeticException);
                System.out.println("Cero es un denominador invalido. Intente de nuevo\n");
            }

        } while (continuarCiclo);

    }
}
