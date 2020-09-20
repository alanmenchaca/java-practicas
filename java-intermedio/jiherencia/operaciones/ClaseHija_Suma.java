package operaciones;
// Clase hija o clase secundaria

/* Colocamos la palabra extends (extender) para heredar el código de 
una clase (en este caso, de la ClasePadre) */
public class ClaseHija_Suma extends ClasePadre {

    /* Para poder utilizar ciertos atributos o métodos de otra clase, 
    se crea un nuevo método. */
    public void sumar() {
        // Atributos heredados de la ClasePadre
        resultado = valor + valor2;
    }
}
