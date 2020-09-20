package limitardecimales;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClasePrincipal {

    public static void main(String[] args) {

        double numero = 2;
        // El método .sqrt() permite calcular la raíz cuadrada de cierto número.
        double raiz = Math.sqrt(numero);

        System.out.println("La raíz cuadra de: " + numero + " es: " + raiz);

        // Utilizando la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        // Se crea un objeto de la clase DecimalFormat, e indicamos que solo muestre dos decimales.
        System.out.println("La raíz cuadra de: " + numero + " es: " + df.format(raiz));

        // Utilizando String format (no hace falta crear un objeto de la clase)
        System.out.println("La raíz cuadra de: " + numero + " es: " + String.format("%.2f", raiz));

        // Utilizando la clase Math.round (4 decimales)
        System.out.println("La raíz cuadra de: " + numero + " es: " + (double) Math.round(raiz * 10000) / 10000);

        // Utilizando la clase BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        // Se crea un objeto de la clase BigDecimal.
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        System.out.println("La raíz cuadra de: " + numero + " es: " + bd.doubleValue());

    }
}
