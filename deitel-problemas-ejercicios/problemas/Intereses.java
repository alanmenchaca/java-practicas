package problemas;

// Cálculos de interés compuesto con BigDecimal.
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Intereses {

    public static void main(String[] args) {

        // monto principal inicial antes de los intereses
        BigDecimal montoPrincial = new BigDecimal(1000.0);
        BigDecimal tasaDeInteres = new BigDecimal(0.05);

        // muestra los encabezados
        System.out.printf("%s%20s%n", "Anio", "Monto de deposito");

        // calculo el monto para el año especificado
        for (int anio = 1; anio <= 10; anio++) {

            // calcula el nuevo monto para el año especificado
            BigDecimal montoConIntereses = montoPrincial.multiply(tasaDeInteres.add(BigDecimal.ONE).pow(anio));
            /* Multiplica el monto principal por la tasa de intereses (el cual se le suma uno)
            elevada a la potencia del año. */
            
            // muestra el año y el monto
            System.out.printf("%4d%20s%n", anio, 
                    NumberFormat.getCurrencyInstance().format(montoConIntereses));
        }
    }

}
