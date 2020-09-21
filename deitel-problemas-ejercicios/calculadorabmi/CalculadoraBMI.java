package calculadorabmi;

import java.util.Scanner;

public class CalculadoraBMI {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso de la persona en kilogramos: ");
        double pesoKg = entrada.nextDouble(); // Peso en kilogramos
        System.out.print("Altura de la persona en metros: ");
        double alturaMts = entrada.nextDouble(); // Altura en metros

        // Fórmula para calcular el Indice de Masa Corporal (BMI)
        double BMI = pesoKg / (alturaMts * alturaMts);
        
        System.out.printf("Indice de Masa Corporal : %.2f%n%n", BMI);

        System.out.println("VALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal:    entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso:     30 o más");
    }
}
