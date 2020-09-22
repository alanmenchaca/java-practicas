package ejemplodeinterfaces;

// La superclase abstracta Empleado que implementa a PorPagar
public abstract class Empleado implements PorPagar {

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

    // devuelve representación String de un objeto Empleado
    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s",
                getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }

    // Nota: Aquí no implementamos el método getMontoPago de PorPagar, así que
    // esta clase debe declararse como abstract para evitar un error de compilación.
}
