package listasdearreglos;

import java.util.ArrayList;
// ArrayList - Listas  de arreglos.

public class ListaDeArreglos {

    public static void main(String[] args) {
        /* Las listas de arreglos son creadas con un tamaño inicial pero cuando este 
        tamaño es sobrepasado, la colección es aumentada automáticamente. */
        ArrayList<String> names = new ArrayList<>(3);

        /* Opcionalmente se puede especificar una capacidad y tipo de objetos que la lista 
        de arreglos almacenará. */
        ArrayList<String> colors = new ArrayList<>(10);

        // La calse ArrayList provee varios métodos útiles para manipular sus objetos.
        // El método .add() añade nuevos objetos al ArrayList.
        colors.add("Red");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Brown");

        // El método .remove() elimina objetos del ArrayList.
        colors.remove(1);
        // Forma distinta de eliminar un objeto del la lista.
        colors.remove("Black");

        // .contains() retorna true si la lista contiene el elemento especificado.
        System.out.println(colors.contains("Blue"));

        /* El método .get(index) devuelve el elemento en la lista quese encuentra en la
        ubicación especificada. */
        colors.get(2);
        System.out.println(colors);

        // .clear() elminia todos los elementos de la lista.
        colors.clear();
        System.out.println(colors);

        // Al igual que con los arreglos, el indexado comienza en 0.
    }

}
