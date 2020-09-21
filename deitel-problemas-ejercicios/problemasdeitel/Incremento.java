package problemasdeitel;

// Fig. 4.15:  Incremento.java
// Operadores de preincremento y postincremento
public class Incremento {

    public static void main(String[] args) {

        // demuestra el operador de postincremento
        int c = 5;
        System.out.printf("  c antes del postincremento: %d%n", c); // imprime 5
        System.out.printf("         postincremento de c: %d%n", c++); // imprime 5
        System.out.printf("c despues del postincremento: %d%n", c); // imprime 6

        System.out.println(""); // omite la línea

        // demuestra el operador de preincremento
        c = 5;
        System.out.printf("  c antes del preincremento: %d%n", c); // imprime 5
        System.out.printf("       preincremento de c: %d%n", ++c); // imprime 6
        System.out.printf("c despues del preincremento: %d%n", c); // imprime 6
    }

}
