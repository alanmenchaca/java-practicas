package main;

/* Le indicamos al programa que queremos utilizar las clases que se encuentran en un paquete
diferente, importando el nombre de la librería a utilizar junto con con el nombre de la Clase. */
import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;

/* La herencia en Java, es el procedimiento utilizado para reutilizar código cuando creamos
 nuevas clases. Pues lo único que se hace, es indicar al programa que queremos reutilizar
 las variables y funciones de una clase que ya hemos creado anteriormente. */
public class ClasePrincipal {

    public static void main(String[] args) {

        // Creamos un objeto (instancia) para poder comunicarnos con otra clase.
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.pedirDatos();
        mensajeroSuma.sumar();
        System.out.println("El resultado de la suma es: ");
        mensajeroSuma.mostrarResultado();

        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.pedirDatos();
        mensajeroResta.restar();
        System.out.println("El resultado de tu resta es: ");
        mensajeroResta.mostrarResultado();

        /* La herencia sirve para compartir código creado previamente en una clase, y utilizarlo
        veces en otras clases, sin tener que volver a escribir el mimsmo código una y otra ves. */
    }
}
