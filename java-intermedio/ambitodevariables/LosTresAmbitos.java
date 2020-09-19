package ambitodevariables;

/*  El ámbito de una variable define su alcance de uso. Es decir, indica en que secciones de
 código una variable estará disponible. Fuera de este ámbito, una variable no podrá ser accedida. */
// Ejemplo  donde aparecen los tres ámbitos
public class LosTresAmbitos {

    // Variable de tipo statico
    static int variable_estatica = 22;

    // Variable de ámbito global,
    int variableGlobal;

    /* La diferencia pricipal que existe entre una variable de ámbito global y una variable 
    de ámbito local es que las variables globales no es obligatoria su inicialización a 
    diferencia de las variables de ámbito local que si es necesario incialiazarlas. */
    void miMétodo(int parametro) {
        int variableLocal = 0;
        // El parámetro también es local dentor del método.
    }

}
