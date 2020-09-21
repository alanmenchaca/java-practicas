package fecha;

// Fig. 8.88: Empleado.java
// Clase Empleado con referencias a otros objetos.
public class Empleado {

    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    // constructor para inicializar nombre, fecha de nacimiento y fecha de contratación.
    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento, Fecha fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaDeNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s, %s Contratado: %s  Cumpleaños: %s",
                apellido, nombre, fechaContratacion, fechaNacimiento);
    }

}
