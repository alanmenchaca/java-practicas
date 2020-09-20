package listasenlazadas;

import java.util.LinkedList;


public class ListaEnlazada {
    
    public static void main(String[] args) {
        
        // No es posible especificar una capacidad inicial para las LinkedList.
        LinkedList<String> names = new LinkedList<>();
        
        names.add("Juan");
        names.add("Pedro");
        names.add("Pepe");
        names.add("Alberto");
        names.add("Diego");
        
        names.remove(4);
        
        // Inserta el elemento especificado al inicio de la lista.
        names.addFirst("Alfredo");
        // Añade el elemento especificado el final de una lista.
        names.addLast("Alfonso");
                
        names.getFirst();
        names.getLast();
        
        // Bucle for mejorado para iterar sobre los elementos de la Lista enlazada.
        for (String name: names) {
            System.out.println("Name: " + name + "!");
        }
    }
}
