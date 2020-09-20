package clases;

public class ClaseHija_consulta extends ClasePadre_abstracta {

    @Override
    public void transacciones() {
        System.out.println("------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("------------------------------------");
    }
}
