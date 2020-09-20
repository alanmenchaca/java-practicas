package clases;

import java.util.Scanner;

public abstract class ClasePadre_abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner jum = new Scanner(System.in);

    public void operaciones() {
        int bandera = 0;
        int seleccion = 0;

        do {

            do {
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");
                seleccion = jum.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-------------------------------------------------");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                ClasePadre_abstracta mensajero = new ClaseHija_consulta();
                mensajero.transacciones();
            } else if (seleccion == 2) {
                ClasePadre_abstracta mensajero = new ClaseHija_retiro();
                mensajero.transacciones();
            } else if (seleccion == 3) {
                ClasePadre_abstracta mensajero = new ClaseHija_deposito();
                mensajero.transacciones();
            } else if (seleccion == 4) {
                System.out.println("-------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("-------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }

    // Método para solicitar cantidad de retiro.
    public void retiro() {
        retiro = jum.nextInt();
    }

    // Método para solicitar deposito.
    public void deposito() {
        deposito = jum.nextInt();
    }

    // Método abstracto.
    public abstract void transacciones();

    // Método setter y getter.
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
