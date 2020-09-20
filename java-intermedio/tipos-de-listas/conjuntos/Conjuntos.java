package conjuntos;

import java.util.HashSet;

public class Conjuntos {

    public static void main(String[] args) {

        // Un set (conjunto) es una colección que no puede contener elementos duplicados.
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");

        System.out.println(set);
        // El método .size() obtiene el número de elementos en el HashSet.
        System.out.println(set.size());
    }
}
