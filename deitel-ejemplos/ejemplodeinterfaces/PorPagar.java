package ejemplodeinterfaces;

// Declaración de la interfaz PorPagar
public interface PorPagar {

    // Todos los campos son ímplicitamente public, static y final.
    
    // Calcula el pago; no hay implementación.
    double obtenerMontoPago();
    /* Todos los métodos que se declaran en una interfaz son de 
    manera implícita public abstract. */
}
