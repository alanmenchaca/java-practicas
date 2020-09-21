package ejemplosproblemas;

// Fig. 5.12: PruebaPolizaAuto.java
// Demostración de objetos String en la instrucción switch
public class PruebaPolizaAuto {

    public static void main(String[] args) {

        // creado dos objetos PolizaAuto
        PolizaAuto poliza1 = new PolizaAuto(111111111, "Toyota Camry", "NJ");
        PolizaAuto poliza2 = new PolizaAuto(222222222, "Ford Fusion", "ML");

        polizaEnEstadoSinCulpa(poliza1);
        polizaEnEstadoSinCulpa(poliza2);

    }

    // método que muestra en pantalla si una PolizaAuto
    // se encuentra en un estado con seguro sin culpa
    public static void polizaEnEstadoSinCulpa(PolizaAuto poliza) {
        System.out.println("La poliza de auto:");
        System.out.printf("Cuenta #: %d; Auto: %s; Estado %s %s un estado sin culpa %n%n",
                poliza.getNumeroCuenta(), poliza.getMarcaYModelo(),
                poliza.getEstado(),
                (poliza.isEstadoSinCulpa() ? "esta en" : "no esta en"));
    }
}
