package interfazgrafica;

import javax.swing.*;
/*La librería awt.event.*; nos permite agregar o importar todas las
funcionalidades que se le pueden dar a los componentes. */
import java.awt.event.*;

public class Swing_JButton extends JFrame implements ActionListener {

    JButton boton;

    public Swing_JButton() {
        setLayout(null);
        boton = new JButton("Cerrar");
        boton.setBounds(300, 250, 100, 30);
        add(boton);
        /* Se le anticipa al boton que realizará una funcionalidad
        conocida como evento. */
        boton.addActionListener(this);
    }

    // Espacio en memoria donde se alojará el evento.
    public void actionPerformed(ActionEvent e) {
        /* El método .getSource() recupera el evento que se origino
        dentro del espacio en memoria */
        if (e.getSource() == boton) {
            /* Con este método (System.exit(0)) le indicamos al programa que 
            al momento de que se presione el boton, el evento que debe 
            de ejecutar es que cierre la interfaz gráfica. */
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        Swing_JButton inter = new Swing_JButton();
        inter.setBounds(0, 0, 450, 350);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
