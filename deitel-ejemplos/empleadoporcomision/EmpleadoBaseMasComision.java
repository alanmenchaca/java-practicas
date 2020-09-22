package empleadoporcomision;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase; // salario base por semana.

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);

        // si ventasBrutas no son válidas, lanza excepción
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salarioBase debe ser >= 0.0");
        }
        
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    // calcula los ingresos de salarioBase.
    @Override
    public double ingresos(){
        return getSalarioBase() + super.ingresos();
    }
    
    // devuelve representación String de EmpleadoBaseMasComision

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "con sueldo base",
                super.toString(), "sueldo base", getSalarioBase());
    }

}
