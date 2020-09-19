package poosuma;

public class POOSuma {

    /* Se crea un espacio en memoria para las variables declaradas
    anteriormente en la clase SumaMain. */
    private int vUno, vDos, resultado;

    /* Se crea un constructor para recibir las variables de la clase SumaMain, y
     se depositan las variables de la clase SumaMain dentro del constructor. */
    public POOSuma(int valUno, int valDos) {
        // La palabra this, hace referencia a la clase que se está utilizando en el momento.
        this.vUno = valUno;
        this.vDos = valDos;
    }

    /* Método que nos ayudará a realizar la suma (este método nos permitirá comunicarnos
    con otros métodos o con otras clases. */
    public void operacion() {
        resultado = vUno + vDos;
    }

    public void imprimir() {
        /* Llamamos el método que se encarga de realizar la suma, ya que este contiene 
        el resultado. */
        operacion();
        System.out.println("El resultado de la suma es: " + resultado);
        
    }

}
