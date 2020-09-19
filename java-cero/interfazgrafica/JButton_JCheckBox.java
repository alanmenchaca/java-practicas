package interfazgrafica;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class JButton_JCheckBox extends JFrame implements ActionListener, ChangeListener {

    private JLabel label;
    private JCheckBox check;
    private JButton boton;

    public JButton_JCheckBox() {
        setLayout(null);
        label = new JLabel("Aceptar Términos y Condiciones");
        label.setBounds(10, 10, 400, 30);
        add(label);

        check = new JCheckBox("Acepto");
        check.setBounds(10, 50, 100, 30);
        check.addChangeListener(this);
        add(check);

        boton = new JButton("Continuar");
        boton.setBounds(10, 100, 100, 30);
        boton.addActionListener(this);
        // Le indicamos al programa que con el método .setEnable() el botón este inactivo.
        boton.setEnabled(false);
        add(boton);
    }

    public void stateChanged(ChangeEvent e) {
        /* Si el JCheckBox esta seleccionado se ejecutaran las siguientes
            líneas de codigo */
        if (check.isSelected() == true) {
            // El botón estará habilitado si el JCheckBox está seleccionado.
            boton.setEnabled(true);
        } else {
            // Si el JCheckBox no está seleccionado, el botón no estará habilitado.
            boton.setEnabled(false);
        }
        
    }

    public void actionPerformed(ActionEvent e) {
        // El método debe originarse en el botón.
        if (e.getSource() == boton) {
            /* El método System.exit(0) indica que al presionar el botón la
                interfaz se cerrará. */
            System.exit(0);
        }
        
    }

    public static void main(String[] args) {
        JButton_JCheckBox inter = new JButton_JCheckBox();
        inter.setBounds(0, 0, 350, 200);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
