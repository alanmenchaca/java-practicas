package javacero;

public class SucesionFibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, c;

        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }

    }

}
