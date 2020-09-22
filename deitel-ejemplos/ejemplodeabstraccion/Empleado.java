package ejemplodeabstraccion;

// La superclase abstracta Empleado.
public abstract class Empleado {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // Devuelve la representación String de un objeto Empleado.
    @Override
    public String toString() {
        return String.format("%s %s%nNúmero de seguro social: %s",
                getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }

    // método abstracto sobrescrito por las subclases concretas
    public abstract double generarIngresos();

    // valida si el salario del Empleado es valido.
    public static void validarSalario(double salarioDelEmpleado) {
        if (salarioDelEmpleado < 0.0) {
            throw new IllegalArgumentException("El salario debe ser >= 0.0");
        }
    }

}
