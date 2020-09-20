package numerosaleatorios;

// Números aleatorios con la calse random.
import java.util.Random;

public class Clase_dos {

    public static void main(String[] args) {

        // La clase Random nos permite obtener números aleatorios más grandes
        Random r = new Random();

        int aleatorio = (int) (r.nextDouble() * 100);
        System.out.println(aleatorio);

    }

}
