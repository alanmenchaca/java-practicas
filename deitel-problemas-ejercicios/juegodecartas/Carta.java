package juegodecartas;

// Fig. 7.9: Carta.java
// La Clase Carta representa una carta del juego.
public class Carta {

    private final String cara; // cara de la carta ("As", "Dos", ...)
    private final String palo; // palo de la carta ("Corazones", "Diamantes", ...)

    public Carta(String cara, String palo) {
        this.cara = cara; // inicializa la cara de la carta
        this.palo = palo; // inicializa el palo de la carta
    }

    @Override
    // Devuelve representación String de Carta
    public String toString() {
        return cara + " de " + palo;
    }
}
