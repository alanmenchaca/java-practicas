package clases;

public class ClaseMain {

    public static void main(String[] args) {

        ClasePadre_abstracta mensajero = new ClaseHija_deposito(); // Upcasting 
        mensajero.setSaldo(2500);
        mensajero.operaciones();
    }
}
