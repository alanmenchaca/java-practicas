package arreglos;

class ArreglosUEstaticos {

    public static void main(String[] args) {

        // Arreglos unidimensionales (vectores estaticos)
        // Un arreglo es una colección de variables del mismo tipo.
        int[] arr = new int[5];
        // La palabra new se emplea para declara un objeto.

        arr[0] = 96;
        arr[1] = 220;
        arr[2] = 68;
        arr[3] = 469;
        arr[4] = 60;

        System.out.print("[" + arr[0] + "]");
        System.out.print("[" + arr[1] + "]");
        System.out.print("[" + arr[2] + "]");
        System.out.print("[" + arr[3] + "]");
        System.out.print("[" + arr[4] + "]");
        /* Java provee un atajo para instanciar arreglos de tipos primitivos y
            cadenas de texto (strings), si se sabe de antemano que valores se van a
            insertar dentro de un arreglo se puede usar un arreglo literal:
            String[] letras  = {"A", "B", "C", "D"}; */
    }

}
