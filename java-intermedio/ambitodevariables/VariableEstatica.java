package ambitodevariables;

public class VariableEstatica {

    /*  Las variables estáticas, o también conocidas como variables de clase, son aquellas que
 pertenecen a la propia clase donde han sido declaradas, y para poder acceder a ellas no
 es necesario crear una instancia de clases. */
    public static int variableEstatica = 17;
    // Variable declarada, de ámbito estatico.
    
    public static void main(String[] args) {
        
        /* Para imprimir una variable estatica desde otra clase, se utiliza el nombre de la clase donde
        se ubica la variable, y se le concatena (con un punto) el nombre de la variable estatica. */
        System.out.println(LosTresAmbitos.variable_estatica);
    }
}


