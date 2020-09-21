package tiempo;

// Fig. 8.1: Tiempo.java
// La declaración de la clase Tiempo1 mantiene la hora en formato de 24 horas.
public class Tiempo1 {

    private int hora; // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    // establece un nuevo valor de tiempo, usando la hora universal;
    // lanza una excepción si la hora, minuto o segundo son inválidos.
    public void setTiempo(int hora, int minuto, int segundo) {

        // valida la hora, el minuto y el segundo
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60
                || segundo < 0 || segundo >= 60) {
            /* La expresión de creación de instancia de clase en la instrucción
            throw crea un nuevo objeto de tipo IllegalArgumentException, en este caso
            llamamos al constructor que nos permite especificar un mensaje de error 
            personalizado. */
            throw new IllegalArgumentException(
                    "hora, minuto y/o segundos estaban fuera de rango");
            /* Después de crear el objeto excepción, la instrucción throw termina de
            inmediato al método establecerTiempo y la excepción regresa al código que
            intentó establecer el tiempo. */
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // convierte a objeto String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        /* Es posible usar la bandera 0 en una especificación de formato de printf,
        para mostrar los ceros a la izquierda para un valor que no utilice todas las
        posiciones de caracteres en la anchura de campo especificado. */
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // convierte a objeto STring en formato de hora estándar (H:MM:SS AM o PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }
}
