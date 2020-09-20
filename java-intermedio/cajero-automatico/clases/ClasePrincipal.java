package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        ClasePadre_abstracta mensajero = new ClaseHija_deposito(); // Upcasting 
        mensajero.setSaldo(2500);
        mensajero.operaciones();
    }
}
