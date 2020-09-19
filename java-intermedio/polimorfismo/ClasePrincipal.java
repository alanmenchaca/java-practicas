package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        // Creamos un objeto con la clase que queremos crear el polimorfismo.
        /* El constructor hace referencia a la clase con la que va a tener el
        comportamiento el método abstracto. */
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija(); // Upcasting
        mensajero_Suma.pedirDatos();
        mensajero_Suma.operaciones();
        mensajero_Suma.mostrarResultado();
        
        Operaciones_ClasePadre mensajero_Resta = new Resta_ClaseHija(); // Upcasting
        mensajero_Resta.pedirDatos();
        mensajero_Resta.operaciones();
        mensajero_Resta.mostrarResultado();
        
    }
}
