package problemasdeitel;
// Fig. 3.12: La Clase Factura

public class Factura {

    private String numDP; // número de pieza
    private String descDP; // descripción de la pieza
    // cantidad de artículos de ese tipo que se van a comprar
    private int cantidadDP;
    private double precio; // precio por el artículo

    public Factura(String numDP, String descDP, int cantidadDP, double precio) {
        this.numDP = numDP;
        this.descDP = descDP;
        this.cantidadDP = cantidadDP;

        // Si la cantidad no es positiva se establecerá con su valor predeterminado.
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public double obtenerMontoFactura() {
        // Multiplica la cantidad de artículos por el precio de cada uno.
        return (cantidadDP * precio);
    }

    public String getNumDP() {
        return numDP;
    }

    public void setNumDP(String numDP) {
        this.numDP = numDP;
    }

    public String getDescDP() {
        return descDP;
    }

    public void setDescDP(String descDP) {
        this.descDP = descDP;
    }

    public int getCantidadDP() {
        return cantidadDP;
    }

    public void setCantidadDP(int cantidadDP) {
        this.cantidadDP = cantidadDP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
