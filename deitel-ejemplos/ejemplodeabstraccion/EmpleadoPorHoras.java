package ejemplodeabstraccion;

// La clase EmpleadoPorHoras extiende a Empleado.
public class EmpleadoPorHoras extends Empleado {

    private double sueldoPorHora;
    private double horasTrabajadas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldoPorHora, double horasTrabajadas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        Empleado.validarSalario(sueldoPorHora);

        if ((horasTrabajadas < 0.0) || (horasTrabajadas > 168.0)) { // valida horas
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {

        Empleado.validarSalario(sueldoPorHora);
        this.sueldoPorHora = sueldoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        if ((horasTrabajadas < 0.0) || (horasTrabajadas > 168.0)) { // valida horas
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double generarIngresos() {
        if (getHorasTrabajadas() <= 40) { // si no hay tiempo extra
            return getSueldoPorHora() * getHorasTrabajadas();
        } else {
            return 40 * getSueldoPorHora() + (getHorasTrabajadas() - 40) * getSueldoPorHora() * 1.5;
        }
    }

    // devuelve representación String de un objeto EmpleadoPorHoras
    @Override
    public String toString() {
        return String.format("Empleado por horas: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "sueldo por hora", getSueldoPorHora(),
                "horas trabajadas", getHorasTrabajadas());
    }

}
