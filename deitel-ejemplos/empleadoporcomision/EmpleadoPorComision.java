package empleadoporcomision;

// La clase EmpleadoPorComision usa los métodos para manipular sus
// variables de instancia private.
public class EmpleadoPorComision {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje por comisión

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        // la llamada implícita al constructor de Object ocurre aquí

        // si ventasBrutas no son válidas, lanza excepción
        if (ventasBrutas <= 0.0) {
            throw new IllegalArgumentException("ventasBrutas debe ser >= 0.0");
        }

        // si tarifaComision no son válidas, lanza excepción
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
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

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas <= 0.0) {
            throw new IllegalArgumentException("ventasBrutas debe ser >= 0.0");
        }

        this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        if (ventasBrutas <= 0.0) {
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");
        }
        this.tarifaComision = tarifaComision;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    // calcula los ingresos
    public double ingresos() {
        return getTarifaComision() * getVentasBrutas();
    }

    // devuelve representación String del objeto EmpleadoPorComision
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Empleador por comisión: ", getPrimerNombre(), getApellidoPaterno(),
                "Número de seguro social: ", getNumeroSeguroSocial(),
                "Ventas Brutas: ", getVentasBrutas(),
                "Tarifa de comisión: ", getTarifaComision());
    }
}
