package collections;

import java.util.ArrayList;
/* Los métodos de la clase Collections son estaticos por lo que no se necesita un
objeto Collections para poder invocarlos */
import java.util.Collections;

public class OrdenandoListas {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(3);

        numeros.add(17);
        numeros.add(22);
        numeros.add(24);
        numeros.add(12);
        numeros.add(11);
        numeros.add(23);
        // El método .sort() ordena los elementos de la colección.
        Collections.sort(numeros);
        System.out.println(numeros);

        ArrayList<String> animales = new ArrayList<>(3);

        animales.add("Perro");
        animales.add("Tigre");
        animales.add("Gato");
        animales.add("Serpiente");
        animales.add("Elefante");
        Collections.sort(animales);
        // El método .sort() ordenó los elementos alfabéticamente.
        System.out.println(animales);
        
        System.out.println(Collections.max(animales));
    }
}
