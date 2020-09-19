package ambitodevariables;

/*  Las variables de ámbito global, o de instancia, son aquellas que pertenecen a la clase 
 donde han sido declaradas, y dependiendo del modificador de acceso utilizado, podrán ser
 accedidas unicamente desde la misma clase. */
public class VariableGlobal {

    /* Las variables de ámbito global se identifican, por que son declaradas
    fuera de la estructura o de cualquier método. */
    int variableGlobal; // Variable global - no se inicializa

    void Metodo() {
        System.out.println("Valor de la variableGlobal: " + variableGlobal);
    }

    public void Prueba() {
        System.out.println("Valor de la variableGlobal: " + variableGlobal);
    }

}
