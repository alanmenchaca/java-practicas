package operaciones;
// Clase base o clase principal
import java.util.Scanner;

/* La clase padre o clase base, es la clase que se debe crear primero, donde se encuentra escrito
 el código que contiene a las variables y métodos que se van a reutilizar. */
public class ClasePadre {

    /* Encapsular los atributos con el modificador de acceso protected,
    es considerada una buena practica a la hora de programar entre clases. */
    protected int valor, valor2, resultado;
    Scanner jum = new Scanner(System.in);

    // Este método pide los valores al usuario.
    public void pedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor = jum.nextInt();

        System.out.print("Dame el segundo valor: ");
        valor2 = jum.nextInt();
    }

    // Este método muestra el resultado.
    public void mostrarResultado() {
        System.out.println(resultado);
    }

}
