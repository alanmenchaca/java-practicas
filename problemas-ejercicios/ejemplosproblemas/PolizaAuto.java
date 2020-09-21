package ejemplosproblemas;

// Fig. 5.11: PolizaAuto.java
// Clase que representa una póliza de seguro de automóvil.
public class PolizaAuto {

    private int numeroCuenta;
    private String marcaYModelo;
    private String estado;

    public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {

        if (estado.equals("MA") || estado.equals("NJ") || estado.equals("NY")) {
            this.estado = estado;
        } else if (estado.equals("PA") || estado.equals("CT") || estado.equals("ME")) {
            this.estado = estado;
        } else if (estado.equals("NH") || estado.equals("VT")) {
            this.estado = estado;
        } else {
            System.out.println("No fue posible establecer un estado.");
        }
    }

    // determina si el estado tiene seguro de auto sin culpa
    public boolean isEstadoSinCulpa() { // obtiene la abreviación del estado del
        // objeto PolizaAuto
        boolean estadoSinCulpa;

        switch (getEstado()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
            case "CT":
            case "ME":
            case "NH":
            case "VT":
                estadoSinCulpa = true;
                break;
            default:
                estadoSinCulpa = false;
                break;
        }

        return estadoSinCulpa;
    }
}
