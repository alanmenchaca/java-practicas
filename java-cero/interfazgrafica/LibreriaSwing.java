package interfazgrafica;
// javax.swing (oscilación): importa los elementos para armar las interfaces.

/* Se importa la librería javax.swing.* el asterisco se utiliza para
invocar todos los elementos de la librería swing, para la interfaz gráfica. */
import javax.swing.*;


/* Al utilizar la palabra extends estamos diciendo que queremos usar 
una clase ya existente en el  JDK (JFrame: contenedor de la interfaz gráfica)
del cual estamos importando de la librería swing. */
public class LibreriaSwing extends JFrame {

    /* En Java la herencia es una técnica para reutilizar código, la palabra 
    extends nos permite utilizar clases preprogramadas por otras personas. */
    private JLabel label;

    /* El modificador de texto private indica que la variable declarada solo
    puede ser accedida desde la misma clase. */

 /* Se crear el constructor (el constructor siempre debe 
    llevar el nombre de la clase) */
    public LibreriaSwing() {
        /* Le indicamos al programa que queremos colocar las coordenadas
        para situar nuestra interfaz, haciendo nulo el método setLayout */
        setLayout(null);
        // Etiqueta que se mostrara dentro de la interfaz gráfica.
        label = new JLabel("Interfaz Gráfica");
        // Se indican las dimensiones de la etiqueta.
        label.setBounds(10, 20, 200, 300);
        add(label);
    }

    public static void main(String[] args) {
        LibreriaSwing interfaz = new LibreriaSwing();
        /* Le indicamos a el programa donde se ubicara la interfaz gráfica en
            la pantalla, despues elegimos sus dimensiones: las cuales tendran un
            ancho de 400 pixeles por un alto de 300 pixeles. */
        interfaz.setBounds(0, 0, 400, 300);
        interfaz.setVisible(true);
        /* La indicamos al programa que la interfaz gráfica aparesca en el centro
            de la pantalla. */
        interfaz.setLocationRelativeTo(null);

    }

}
/* Una interfaz gráfica es programa informatico que facilita el entorno 
visual utilizando un conjunto de imagenes y objetos gráficos para representar
las acciones y la información disponible en la interfaz.

Su principal uso, consiste en proporcionar un entorno visual sencillo para 
permitir la comunicación con el sistema operativo de una máquina o computador.*/
