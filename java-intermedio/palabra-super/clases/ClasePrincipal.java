package clases;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        // Se crea una instancia con la clase Hija.
        Padre mensajero = new Hija();
        // Mostramos el método saludar, de la clase hija.
        mensajero.saludar();
    }
}
