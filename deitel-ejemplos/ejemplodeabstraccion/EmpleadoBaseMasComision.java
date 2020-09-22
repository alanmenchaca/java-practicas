package ejemplodeabstraccion;

// La clase EmpleadoBaseMasComision extiende a EmpleadoPorComision
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);

        Empleado.validarSalario(salarioBase);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        Empleado.validarSalario(salarioBase); // valida el salario base.
        this.salarioBase = salarioBase;
    }

    // calcula los ingresos; sobrescribe el método ingresos de EmpleadoPorComision
    @Override
    public double generarIngresos() {
        return getSalarioBase() + super.generarIngresos();
    }

    // devuelve representación String de un objeto EmpleadoBaseMasComision
    @Override
    public String toString() {
        return String.format("%s %s;  %s: $%,.2f",
                "con salario base", super.toString(),
                "salario base", getSalarioBase());
    }

}
