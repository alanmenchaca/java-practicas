package interfazgrafica;

import java.awt.event.*;
import javax.swing.*;

public class ButtonsAndLabels extends JFrame implements ActionListener {

    private JButton boton, boton2, boton3;
    private JLabel label;

    public ButtonsAndLabels() {
        setLayout(null);
        boton = new JButton("Botón 1");
        boton.setBounds(10, 100, 90, 30);
        add(boton);
        boton.addActionListener(this);

        boton2 = new JButton("Botón 2");
        boton2.setBounds(110, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Botón 3");
        boton3.setBounds(210, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);

        label = new JLabel("En espera...");
        label.setBounds(10, 10, 300, 30);
        add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            /* Al momento de presionar el botón, con el método .setText() le
                indicamos al programa que coloque un texto a la etiqueta (label). */
            label.setText("Has presionado el botón 1");
        }
        if (e.getSource() == boton2) {
            label.setText("Has presionado el botón 2");
        }
        if (e.getSource() == boton3) {
            label.setText("Has presionado el botón 3");
        }

    }

    public static void main(String[] args) {
        ButtonsAndLabels inter = new ButtonsAndLabels();
        inter.setBounds(0, 0, 330, 200);
        inter.setVisible(true);
        inter.setResizable(true);
        inter.setLocationRelativeTo(null);
    }

}
