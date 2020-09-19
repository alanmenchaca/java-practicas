package thisarearectangulo;

import java.util.Scanner;

public class Rectangulo {

    private int base, altura, area;

    public Rectangulo(int base, int altura) {
        /* Hacemos uso de la palabra reservada this (con la palabra this hacemos
        referencia a las variables de la misma clase. */
        this.base = base;
        this.altura = altura;
    }

    public void calculoArea() {
        area = base * altura;
    }

    public void imprimir() {
        calculoArea();
        System.out.println("El area es: " + area);
    }

}
