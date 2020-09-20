package ejemplos;

public class Conversiones {
    
    public static void main(String[] args) {
        
        double anguloEnGrados = 45;
        // El método .toRadians() nos permite convertir algo que está en grados a radianes.
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        System.out.println("Deg a Rad: " + anguloEnGrados + "° = " + anguloEnRadianes + " rad");
        
        // El método .toDegrees() nos permite convertir algo que está en radianes a grados.
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Rad a Deg: " + anguloEnRadianes + " = " + anguloEnGrados + "°");
    }
}
