package ejemplosproblemas;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsModificado {

    // Crea un generador de números aleatorios seguros para usarlo en el método
    // tirarDado
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    // enumeración con constantes que representan el estado del juego
    private enum Estado {
        CONTINUA, GANO, PERDIO
    };

    // constantes que representan tiros comunes del dado
    private static final int DOS_UNO = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;
    private static int saldoBanco = 1000;

    // ejecuta un juego de craps
    public static void main(String[] args) {

        int miPunto = 0;
        Estado estadoJuego;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una apuesta: ");
        int apuesta = entrada.nextInt();

        while (apuesta > saldoBanco) {
            System.out.print("Ingresa un valor valido: ");
            apuesta = entrada.nextInt();
        }

        int sumaDeDados = tirarDados();

        // determina el estado del juego y el punto con base en el primer tiro
        switch (sumaDeDados) {
            case SIETE: // gana con 7 en el primer tiro
            case ONCE: // gana con 11 en el primer tiro
                estadoJuego = Estado.GANO;
                System.out.println("Saldo Banco: " + (saldoBanco + apuesta));
                System.out.println("Ganó: " + apuesta);
                charla(estadoJuego);
                break;
            case DOS_UNO: // pierde con 2 en el primero tiro
            case TRES: // pierde con 3 en el primer tiro
            case DOCE: // pierde con 12 en el primer tiro
                estadoJuego = Estado.PERDIO;
                System.out.println("Saldo Banco: " + (saldoBanco - apuesta));
                System.out.println("Perdió: " + apuesta);
                charla(estadoJuego);
                break;
            default: // no ganó ni perdio, por lo que guarda el punto
                estadoJuego = Estado.CONTINUA; // no ha terminado el juego
                charla(estadoJuego);
                miPunto = sumaDeDados; // guarda el punto
                System.out.printf("El punto es %d%n", miPunto);
                break;
        }

        // mientras en juego no este terminado
        while (estadoJuego == Estado.CONTINUA) { // no GANO ni PERDIO

            sumaDeDados = tirarDados(); // tira los dados de nuevo.
            charla(estadoJuego);

            if (sumaDeDados == miPunto) {
                estadoJuego = Estado.GANO;
                System.out.println("Saldo Banco: " + (saldoBanco + apuesta));
                System.out.println("Ganó: " + apuesta);
                charla(estadoJuego);
            } else if (sumaDeDados == SIETE) { // pierde al tirar 7 antes del punto
                estadoJuego = Estado.PERDIO;
                System.out.println("Saldo Banco: " + (saldoBanco - apuesta));
                System.out.println("Perdió: " + apuesta);
                charla(estadoJuego);
            }
        }

        if (estadoJuego == Estado.GANO) {
            System.out.println("El jugador gana.");
        } else {
            System.out.println("El jugador perdio");
        }

    }

    public static int tirarDados() {
        // elige valores aleatorios para los lados
        int dado1 = 1 + numerosAleatorios.nextInt(6); // primer tiro del dado
        int dado2 = 1 + numerosAleatorios.nextInt(6); // segundo tiro del dado

        int suma = dado1 + dado2; // suma de los valores de los dados

        // muestrar los resultados de este tiro
        System.out.printf("El jugador tiro %d + %d = %d%n", dado1, dado2, suma);
        return suma;
    }

    public static void charla(Estado estadoJuego) {

        SecureRandom numAleatorio = new SecureRandom();

        int valor = 1 + numAleatorio.nextInt(2);

        if ((valor == 1) && (estadoJuego == Estado.PERDIO)) {
            System.out.println("¡Oh!, se esta yendo a la quiebra, ¿verdad?");
        } else if ((valor == 2) && (estadoJuego == Estado.PERDIO)) {
            System.out.println("¡Oh, vamos, arriésguese!");
        } else if(estadoJuego == Estado.GANO){
            System.out.println("La hizo en grande. ¡Ahora es tiempo de cambiar sus fichas por efectivo!");
        }
    }

}
