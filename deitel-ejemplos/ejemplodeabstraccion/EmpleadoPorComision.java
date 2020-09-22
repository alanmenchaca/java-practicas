package ejemplodeabstraccion;

// La clase EmpleadorPorComision extiende a Empleado.
public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de Comisión

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) { // valida
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }

        this.tarifaComision = tarifaComision;
        this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) { // valida
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double generarIngresos() {
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "empleado por comision", super.toString(),
                "ventas Brutas", getVentasBrutas(),
                "tarifa de comision", getTarifaComision());
    }
}
