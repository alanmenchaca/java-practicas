package problemasdeitel;

// Fig. 3.9: PruebaCuenta.java
// Entrada y salida de números de punto flotante con objetos Cuenta.
import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        // muestra el saldo inicial de cada objeto
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (pompt)
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
                montoDeposito);
        cuenta1.depositar(montoDeposito); // suma el saldo de cuenta1

        System.out.print("Escriba el monto a retirar para cuenta1: "); // indicador (pompt)
        double montoRetiro = entrada.nextDouble();
        System.out.printf("%nrestando %.2f al saldo de cuenta1%n%n",
                montoRetiro);
        cuenta1.retirar(montoRetiro);// suma el saldo de cuenta1

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (pompt)
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
                montoDeposito);
        cuenta2.depositar(montoDeposito); // suma el saldo de cuenta1

        System.out.print("%nEscriba el monto a retirar para cuenta1: "); // indicador (pompt)
        montoRetiro = entrada.nextDouble();
        System.out.printf("%nrestando %.2f al saldo de cuenta1%n%n",
                montoRetiro);
        cuenta1.retirar(montoRetiro);// suma el saldo de cuenta1

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

    } // fin de main

    public static void mostrarCuenta(Cuenta cuentaAMostrar) {
        System.out.printf("Saldo de %s: $%.2f%n",
                cuentaAMostrar.getNombre(), cuentaAMostrar.getSaldo());
    }
    
} // fin de la clase PruebaCuenta
