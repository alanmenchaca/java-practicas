package frecuenciascardiacas;

public class FrecuenciasCardiacas {

    private String nombre; // Primer nombre de la persona
    private String apellido; // Apellido de la persona
    private int dia; // Día de nacimiento
    private int mes; // Mes de nacimiento
    private int año; // Año de nacimiento

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Método que calcula y devuelvue la edad de la persona (en años).
    public int obtenerEdad() {
        if (mes <= 07) {
            if (dia <= 12) {
                return ((2019 - año));
            } else {
                return ((2019 - año) - 1);
            }
        } else {
            return ((2019 - año) - 1);
        }
    }

    // Método que calcula y devuelve la frecuencia cardiaca máxima de la persona.
    public int fCMaxima() {
        /* La fórmula para calcular la frecuencia máxima en pulsos por
        minuto es 220 menos su edad en años. */
        return 220 - obtenerEdad();
    }

    // Método que calcula y devuelve la frecuencia cardiaca esperada de la persona.
    public String fCEsperada() {
        // 50% de la frecuencia máxima de la persona.
        int rango1 = (50 * fCMaxima() / 100);
        // 85% de la frecuencia máxima de la persona.
        int rango2 = (85 * fCMaxima() / 100);
        /* Su frecuencia cardiaca esperada tiene un rango que está entre el 
        50% y 85% de su frecuencia cardiaca máxima. */
        return String.format("La Frecuencia Cardiaca %nesperada es de: "
                + "%d a %d pulsos%n", rango1, rango2);
    }

    /* Métodos setter y getters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
