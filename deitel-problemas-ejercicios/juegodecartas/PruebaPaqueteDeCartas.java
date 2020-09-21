package juegodecartas;

// Fig. 7.11: PruebaPaqueteDeCartas.java
// Aplicación para barajar y repartir cartas
public class PruebaPaqueteDeCartas {

    // ejecuta la aplicación
    public static void main(String[] args) {

        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar(); // Coloca las Cartas en orden aleatorio.

        // Imprime las 52 Cartas en el orden en el que se reparte
        for (int i = 1; i <= 52; i++) {

            //reparte e imprime una Carta 
            System.out.printf("%-20s", miPaqueteDeCartas.repartirCarta());

            if (i % 4 == 0) {
                // imprime una nueva línea después de cada cuatro cartas.
                System.out.println();
            }
        }
    }
}
