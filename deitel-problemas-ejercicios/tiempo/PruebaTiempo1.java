package tiempo;

public class PruebaTiempo1 {

    public static void main(String[] args) {

        // crea e inicializa un objeto Tiempo1
        Tiempo1 tiempo = new Tiempo1(); // invoca al constructor de Tiempo1

        // imprime representaciones en cadena del tiempo.
        mostrarTiempo("Despues de crear el objeto tiempo", tiempo);
        System.out.println();

        // modifica el tiempo e imprime el tiempo actualizado
        tiempo.setTiempo(13, 27, 6);
        mostrarTiempo("Despues de llamar a setTiempo", tiempo);
        System.out.println();

        // intenta establecer el tiempo con valores inválidos:
        try {
            tiempo.setTiempo(99, 99, 99); // todos los valores fuera de rango.
        } catch (IllegalArgumentException e) {
            System.out.printf("Excepcion: %s%n%n", e.getMessage());
        }

        // muestra el tiempo después de tratar de establecer los valores inválidos
        mostrarTiempo("Despues de llamar a establecerTiempo con valores invalidos", tiempo);
    }

    // muestra un objeto Tiempo1 en formatos de 24 horas y 12 horas.
    private static void mostrarTiempo(String encabezado, Tiempo1 t) {
        System.out.printf("%s%nTiempo universal: %s%nTiempo estandar: %s%n",
                encabezado, t.aStringUniversal(), t.toString());
    }
}
