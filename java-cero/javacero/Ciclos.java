package javacero;

public class Ciclos {

    public static void main(String[] args) {

        int i = 1, j = 99;

        // Ciclos o Bucles (Estructura repetitiva: for, while & do-while)
        System.out.println("Serie con for:");
        for (i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.print(j);
            }
            j--;

        }// for
        System.out.println("\n");
        i = 1;
        j = 99;

        System.out.println("Serie con while:");
        while (i <= 5) {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.print(j);
            }
            i++;
            j--;

        }// while
        System.out.println("\n");
        i = 1;
        j = 99;

        System.out.println("Serie con do-while:");
        do {
            if (i < 5) {
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.print(j);
            }
            i++;
            j--;
        } while (i <= 5);// do-while

    }

}
