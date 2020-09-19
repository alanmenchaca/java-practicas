package interfazgrafica;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

public class Swing_JRadioButton extends JFrame implements ChangeListener {

    // Creación de los 3 componentes JRadioButton
    private JRadioButton radio, radio2, radio3;
    // Se crea el componente Grupo de Botones
    private ButtonGroup bg;

    public Swing_JRadioButton() {
        setLayout(null);
        bg = new ButtonGroup();
        radio = new JRadioButton("640*420");
        radio.setBounds(10, 20, 100, 30);
        radio.addChangeListener(this);
        add(radio);
        // Agregamos el componente JRadioButton3 al grupo de Botones.
        bg.add(radio);

        setLayout(null);
        radio2 = new JRadioButton("800*600");
        radio2.setBounds(10, 70, 100, 30);
        radio2.addChangeListener(this);
        add(radio2);
        // Agregamos el componente JRadioButton2 al grupo de Botones.
        bg.add(radio2);

        setLayout(null);
        radio3 = new JRadioButton("1024*768");
        radio3.setBounds(10, 120, 100, 30);
        radio3.addChangeListener(this);
        add(radio3);
        // Agregamos el componente JRadioButton al grupo de Botones.
        bg.add(radio3);
    }

    public void stateChanged(ChangeEvent e) {
        // Los JRadioButton solo pueden ser seleccionados uno a la vez
        if (radio.isSelected()) {
            setSize(640, 420);
        }
        if (radio2.isSelected()) {
            setSize(800, 600);
        }
        if (radio3.isSelected()) {
            setSize(1024, 768);
        }
        
    }

    public static void main(String[] args) {
        Swing_JRadioButton inter = new Swing_JRadioButton();
        inter.setBounds(0, 0, 350, 230);
        inter.setVisible(true);
        inter.setResizable(false);
    }

}
