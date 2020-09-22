package manejodeexcepciones;

// Límpieza de la pila y obtención de datos de un objeto excepción.
public class UsoDeExcepciones {

    public static void main(String[] args) {

        try {
            metodo1();

            // atrapa la excepción lanzada en método1.
        } catch (Exception excepcion) {

            System.err.printf("%s%n", excepcion.getMessage());

            // obtiene la información de rastreo de la pila
            StackTraceElement[] elementosRastreo = excepcion.getStackTrace();

            System.out.println("\nRastreo de a pila de getStackTrace:");
            System.out.println("Case\t\t\t\t\tArchivo\t\t\tLínea\tMétodo");

            // itera a través de elementosRastreo para obtener la descripción de la excepción.
            for (StackTraceElement elemento : elementosRastreo) {
                System.out.printf("%s\t", elemento.getClassName());
                System.out.printf("%s\t", elemento.getFileName());
                System.out.printf("%s\t", elemento.getLineNumber());
                System.out.printf("%s%n", elemento.getMethodName());
            }
        }
    }

    // llama a metodo2; lanza las excepciones de vuelta a main.
    public static void metodo1() throws Exception {
        metodo2();
    }

    // llama a metodo3; lanza las excepciones de vuelta a metodo1.
    public static void metodo2() throws Exception {
        metodo3();
    }

    // lanza la excepción Exception de vuelta a metodo2.
    public static void metodo3() throws Exception {
        throw new Exception("La excepcion se lanzo en metodo3");
    }

}
