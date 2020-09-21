package ejemplosproblemas;

public class SalidaTabular {

    public static void main(String[] args) {

        int i = 1;

        System.out.println("N\t10*N\t100*N\t1000*N\n");

        while (i <= 5) {
            System.out.println(i + "\t" + (i * 10) + "\t" + (i * 1000) + "\t" + (i * 1000));
            i++;
        }
    }
}
