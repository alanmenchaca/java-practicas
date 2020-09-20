package clases;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        // Instancia SinConstructor
        SinConstructor mensajero = new SinConstructor();
        mensajero.pedirNombre();
        mensajero.imprimir();
        
        // Instancia ConConstructor
        ConConstructor mensajero2 = new ConConstructor();
    }
}
