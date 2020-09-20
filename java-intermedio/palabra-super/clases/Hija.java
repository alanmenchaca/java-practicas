package clases;

public class Hija extends Padre {

    /* La palabra reservada super se usa para acceder a un elemento en la clase 
    padre. Uno de los usos más frecuentes que le damos a la palabra super, es
    poder invocar al constructor de la clase padre. Con ello podemos reducir
    la cantidad de código que debemos escribir en nuestras clases hijas. */
    
    @Override
    public void saludar(){
        /* Mostramos un método de la clase Padre, con la ayuda
        de la palabra reservada "super". */
        super.saludar();
    }
}
