package manejodeexcepciones;

// Las excepciones encadenadas
public class UsoDeExcepcionesEncadenadas {

    public static void main(String[] args) {

        try {
            metodo1();

        } catch (Exception excepcion) {
            // Excepciones lanzadas desde método1. 
            excepcion.printStackTrace();
        }
    }

    // llama a metodo2; lanza las excepciones de vuelta a main
    public static void metodo1() throws Exception {
        try {
            metodo2();

        } catch (Exception exception) {
            // Excepcion lanzada desde metodo2.
            throw new Exception("La excepcion se lanzo en metodo1", exception);
        }
    }

    // llama a metodo3; lanza las excepciones de vuelta metodo1
    public static void metodo2() throws Exception {
        try {
            metodo3();

        } catch (Exception exception) { // Excepcion lanzada desde metodo3.

            /* Se hace una llamada al constructor Exception con dos argumentos, el
            segundo argumento representa la excepción que era causa original del problema. */
            throw new Exception("La excepcion se lanzo en metodo2", exception);
        }
    }

    // lanza excepción Exception de vuelta a metodo2.
    public static void metodo3() throws Exception {

        throw new Exception("La excepcion se lanzo en metodo3.");
    }
}
