package juegodecartas;

// Fig. 7.10: PaqueteDeCartas.java
import java.security.SecureRandom;

// La clase PaqueteDeCartas representa un paquete de cartas de juego.
public class PaqueteDeCartas {

    private Carta[] paquete; // arreglo de objetos Carta.
    private int cartaActual; // índice  de la siguiente a repartir (0 a 51)
    private final static int NUMERO_DE_CARTAS = 52; // número constante de cartas

    // generador de números aleatorios
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    // El constructor llena el paquete de cartas
    public PaqueteDeCartas() {
        String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis",
            "Siete", "Ocho", "Nueve", "Diez", "Joker", "Reina", "Rey"};
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Espadas"};

        /* Creamos una instancia del arreglo paquete con un número de elementos
        igual al NUMERO_DE_CARTAS(52). */
        paquete = new Carta[NUMERO_DE_CARTAS]; // crea arreglos de objetos carta
        cartaActual = 0;

        // Llena el paquete con objetos Carta.
        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            /* El cálculo cuenta % 13, siempre produce un valor de 0 a 12 (los 13
            índices del arreglo cara) y el cálculo cuenta / 13, siempre produce un valor
            de 0 a 3 )los cuatro índices del arreglo palos).*/
            paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
        }
        /* Cuando se inicializa el arreglo paquete, contiene los objetos Carta con las
        caras del "As" al "Rey" en orden para cada palo (los 13 "Corazones", luego todos
        los "Diamantes", los "Treboles" y las "Espadas"). */
    }

    // baraja el paquete de Caartas con algoritmo de una pasada.
    public void barajar() {
        // La siguiente llamada al método repartirCarta debe empezar en paquete[0] otra vez.
        cartaActual = 0;

        // para cada Carta, seleccionamos otra Carta aleatoria (0 a 51 y las intercambia.
        for (int primera = 0; primera < paquete.length; primera++) {

            // selecciona un número aleatorio entre 0 y 51
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

            // intercambia Carta actual con la Carta seleccionada al azar.
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
            /* Para cada objeto Carta se elige al azar un número entre 0 y 51 para elegir
            otro objeto Carta. A continuación, el objeto Carta actual y el objeto Carta
            seleccionado al azar se intercambian en el arreglo. */
        }
    }

    // reparte una Carta
    public Carta repartirCarta() {
        // determina si quedan cartas por repartir
        /* Si el paquete no está vacío (es decir, si cartaActual es menor que 52) se regresa el
        objeto Carta "superior" e incrementa positivamente cartaActual para prepararse para la
        siguiente llamada a repartir Carta; en caso contrario, se devuelve null.
        */
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++];
        } else {
            return null;
        }
    }
}
