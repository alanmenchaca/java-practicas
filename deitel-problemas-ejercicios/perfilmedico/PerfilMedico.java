package perfilmedico;

import java.util.Calendar;

public class PerfilMedico {

    private String pNombre;   // Primer nombre de la persona  
    private String apellido;  // Apellido de la persona
    private String sexo;      // Sexo
    private double alturaCM;  // Altura en Centímetros
    private double pesoKg;    // Peso en Kilogramos
    private int dia;          // Día de nacimiento
    private int mes;          // Mes de nacimiento
    private int año;          // Año de nacimiento

    public PerfilMedico(String pNombre, String apellido, String sexo, double alturaCM, double pesoKg, int dia, int mes, int año) {
        this.pNombre = pNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.alturaCM = alturaCM;
        this.pesoKg = pesoKg;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Método que calcula y devuelvue la edad de la persona (en años).
    public int obtenerEdad() {
        // Clase para obtener la fecha actual.
        Calendar fecha = Calendar.getInstance();
        if (mes <= fecha.get(Calendar.MONTH) + 1) {
            if (dia <= fecha.get(Calendar.DAY_OF_MONTH)) {
                return ((fecha.get(Calendar.YEAR) - año));
            } else {
                return ((fecha.get(Calendar.YEAR) - año) - 1);
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

    public double obtenerBMI() {
        // Fórmula para calcular el Indice de Masa Corporal (BMI)
        double alturaM = alturaCM / 100; // Altura en metros
        return pesoKg / Math.pow(alturaM, 2);
    }

    public String getPNombre() {
        return pNombre;
    }

    public void setPNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAlturaCM() {
        return alturaCM;
    }

    public void setAlturaCM(double alturaCM) {
        this.alturaCM = alturaCM;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
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
