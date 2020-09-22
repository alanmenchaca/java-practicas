package ejemplodeabstraccion;

// La clase concreta EmpleadoAsalariado extiende a la clase abstracta Empleado.
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        // Lanza una excepción si el salario ingresado no es valido.
        Empleado.validarSalario(salarioSemanal);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {

        Empleado.validarSalario(salarioSemanal);
        this.salarioSemanal = salarioSemanal;
    }

    // calcula los ingresos String de un objeto EmpleadoAsalariado
    @Override
    public double generarIngresos() {
        return getSalarioSemanal();
    }

    // devuelve representación String de un objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return String.format("Empleado Asalariado: %s%n%s: $%,.2f",
                super.toString(), "salario semanal", getSalarioSemanal());
    }

}
