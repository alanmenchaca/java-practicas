package ejemplodeinterfaces;

// La clase Factura implementa a PorPagar
public class Factura implements PorPagar {

    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {

        validarCantidadDeArticulos(cantidad);
        validarPrecioDeArticulo(precioPorArticulo);

        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        validarCantidadDeArticulos(cantidad);
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        validarPrecioDeArticulo(precioPorArticulo);
        this.precioPorArticulo = precioPorArticulo;
    }

    @Override
    public String toString() {
        
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "Factura", "Número de pieza", getNumeroPieza(), getDescripcionPieza(),
                "antidad", getCantidad(), "precio por artículo", getPrecioPorArticulo());
    }

    @Override
    public double obtenerMontoPago() {
        // calcula el costo total
        return getCantidad() * getPrecioPorArticulo();
    }

    private static void validarCantidadDeArticulos(int cantidad) {
        if (cantidad < 0) { // valida la cantidad
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
        }
    }

    private static void validarPrecioDeArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0) { // valida el precioPorArtciulo
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");
        }
    }

}
