package ambitodevariables;

/*  Las variables de ámbito local, o también conocidas como variable de bloque, son aquellas
 que sólo pueden ser accedidas desde el bloque de código en el que han sido declaradas. */
public class VariableLocal {

    /* Las variables locales forzosamente deben de ser inicializadas dentro del
    cuerpo de un método o estructura (sea repetitiva, condicional, o de control). */
    void miMetodo(int parametro) {
        // Variable local - se debe inicializar
        int variableLocal = 52;

        System.out.println("El valor d la variableLocal es: " + variableLocal);
        /*  Al pasar parametros o argumentos a través de un método estos también son de ámbito
        local, es decir solo los vamos a poder utilizar dentro del cuerpo del método o estructura. */
        System.out.println("El valor de parámetro es: " + parametro);
    }

}
