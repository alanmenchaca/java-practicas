package polimorfismo;

import java.util.Scanner;

/* Para crear el polimorfismo tambíén se le agrega la palabra reservada "abstract"
a la clase. */
public abstract class Operaciones_ClasePadre {

    Scanner jum = new Scanner(System.in);
    protected int valor, valor2, resultado;
    
    public void pedirDatos(){
        System.out.print("Dame el primer valor: ");
        valor = jum.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = jum.nextInt();
    }
    
    /* Creamos el polimorfismo añadiendole la palabra reservada "abstract" al
    método operaciones. */
    public abstract void operaciones();
    
    public void mostrarResultado(){
        System.out.print("El resultado es: " + resultado);
        System.out.println("");
    }
}
