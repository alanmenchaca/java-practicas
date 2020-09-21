package fecha;

// Fig. 8.7: Fecha.java
// Declaración de la clase Fecha.
public class Fecha {

    private int dia; // 1-31 con base en el mes
    private int mes; // 1-12
    private int anio; // cualquier año

    private static final int[] diasPorMes = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirma el valor apropiado para el mes y el dia, dado el año;
    public Fecha(int dia, int mes, int anio) {
        // revisa si el mes está en el rango
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException(
                    "mes (" + mes + ") debe ser 1-12");
        }

        // revisa si dia está en el rango para mes
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
            // se lanza una excepción si el valor está fuera de rango.
            throw new IllegalArgumentException("dia (" + dia
                    + ") fuera de rango para el mes y anio especificados.");
        }

        // revisa si es año bisiesto cuando mes es 2 y dia es 29
        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            throw new IllegalArgumentException("dia (" + dia
                    + ") fuera de rango para el mes y anio especificados.");
        }

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        /* Puesto que this es una referencia al objeto Fecha actual, se hace una llamada
        implícita al método toString() del objeto para obtener la representanción String
        del mismo. */
        System.out.printf("Constructor de objeto Fecha para la fecha %s%n", this);
    }

    // devuelve un objeto STring de la forma mes/dia/anio
    @Override
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, anio);
    }
}
