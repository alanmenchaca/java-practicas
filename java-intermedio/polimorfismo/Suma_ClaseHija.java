package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre {
    
    /* Le indicamos al programa que queremos sobreescribir un método, con la 
    palabra @Override, cuando nosotros sobreescribimos un método es por que
    ya fue declarado previamente en otra clase, la palabra @Override está 
    haciendo referencia al método de otra clase. */
    @Override
    public void operaciones(){
        resultado = valor + valor2;
    }    
    
     /* Cuando sobreescribimos un método es por que estamos utilizando un polimorfismo,
    es decir, declaramos un método en una clase y en otra clase completamente diferente 
    vamos a escribir la lógica del método anteriormente declarado. */
}
