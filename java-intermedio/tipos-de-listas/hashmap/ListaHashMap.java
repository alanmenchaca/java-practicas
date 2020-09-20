package hashmap;

import java.util.HashMap;

public class ListaHashMap {

    public static void main(String[] args) {

        /* Los HashMap son utilizados para almacenar colecciones de datos como pares de clave
        y valor. Un objeto es utilizado como una clave (índice) para otro objeto (valor). */
        HashMap<String, Integer> puntos = new HashMap<>();

        /* Los métodos put, remove y get son utilizados para añadir, borrar y acceder a los
        valores en el HashMap. */
        puntos.put("Amy", 154);
        // HashMap con Strings como sus claves y Enteros como sus valores.
        puntos.put("Dave", 42);
        puntos.put("Rob", 733);

        /* Un HashMap no puede contener claves duplicadas. Añadir un nuevo elemento con una clave
        que ya existe sobreescribe el elemento anterior. */
        puntos.put("Rob", 23);
        puntos.put("Peter", 200);
        puntos.put("Rodolfo", 560);

        puntos.remove("Amy");
        /* Es necesario colocar la clave de elemento al que queremos acceder al utilizar el
        método .get() */
        System.out.println(puntos.get("Dave"));
        System.out.println(puntos);

        /* La clase HashMap provee método containsKey y containsValue para determinar la presencia
        de una clave o valor específico respectivamente. */
        System.out.println(puntos.containsValue(42)); // Retorna true, ya que si contiene un valor 42.
        System.out.println(puntos.containsKey("Pepe")); // Retorna false, ya que la llave especificada no existe.
    }
}
