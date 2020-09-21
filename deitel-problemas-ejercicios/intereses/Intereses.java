package intereses;

// Fig. 5.6: Intereses.java
// Cálculo de interés compuesto con for.
public class Intereses {

    public static void main(String[] args) {

        double monto; // monto depositado al final de cada año.
        double principal = 1000.0; // monto inicial antes de los intereses.
        double tasa = 0.05; // tasa de interés.

        // muestra los encabezados
        System.out.printf("%s%20s%n", "Anio", "Monto en deposito");
        /* El entero 20 entre el % y el carácter de conversión "s" indica que el valor
        a imprimir debe mostrarse con una anchura de campo de 20. Si el a imprimir 
        tiene una anchura menor a 20 posiciones de caracteres, el valor se justifica
        a la derecha en el campo de manera predeterminada.
         */

        // calcula el monto del depósito para cada uno de diez años.
        for (int anio = 1; anio <= 10; anio++) {

            // calcula el nuevo monto para el año especificado.
            monto = principal * Math.pow(1.0 + tasa, anio);

            /* El año se imprime con una anchura de campo de cuatro caracteres (según
            lo especificado por %4d). El monto se imprime como un número de punto flotante
            con el especificador de formato %,20.2f. La bandera de formato (,) indica que el
            valor de punto flotante debe imprimirse con un separador de agrupamiento (el número
            se imprimirá usando comas para separar cada tres dígitos) ejemplo: 1,234.45. */
            System.out.printf("%4d%,20.2f%n", anio, monto);
            /* El número 20 en la especificación del formato indica que el valor debe imprimirse
            justificado a la derecha, con una anchira de campo de 20 caracteres. El .2 especifica
            la precisión del número con formato; en este caso, el número se redondea a la
            centésima más cercana y se imprime con dos dígitos a la derecha del punto decimal. */
        }
    }
}
