package interfazgrafica;

import javax.swing.*;

public class Swing_JFrame extends JFrame {

    public Swing_JFrame() {
        setLayout(null);
    }

    public static void main(String[] args) {
        Swing_JFrame inter = new Swing_JFrame();
        /* La interfaz se ubicara a 350 pixeles hacía la derecha y
            100 pixeles hacía abajo. */
        inter.setBounds(350, 100, 400, 550);
        // Por defecto (.setBounds()): hasta la izquierda, y hasta arriba.
        inter.setVisible(true);
        /* Con el método .setResizable() indicamos si damos permiso al 
            usuario de modificar el tamaño de la interfaz. */
        inter.setResizable(false);
        /* El método .setLocationRelativeTo() ignora las coordenadas puestas
            en el método .setBounds() y coloca la interfaz gráfica en el centro
            de la pantalla. */
        inter.setLocationRelativeTo(null);
    }

}
