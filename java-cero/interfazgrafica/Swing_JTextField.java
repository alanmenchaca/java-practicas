package interfazgrafica;

import javax.swing.*;
import java.awt.event.*;

public class Swing_JTextField extends JFrame implements ActionListener {

    /* El componente JTextField añade una pequeña caja de texto en el 
    cual el usuario puede ingresar datos.*/
    private JTextField textField;
    private JLabel label;
    private JButton boton;

    public Swing_JTextField() {
        setLayout(null);
        label = new JLabel("Usuario:");
        label.setBounds(10, 10, 100, 30);
        add(label);

        textField = new JTextField();
        textField.setBounds(120, 17, 150, 20);
        add(textField);

        boton = new JButton("Aceptar");
        boton.setBounds(10, 80, 100, 30);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == boton) {
            /* El método .getText()  nos ayuda a obtener el texto
                que el usuario haya escrito en algún componente.
                Para poder asignarlo en la variable tipo String (texto).*/
            String texto = textField.getText();
            /* Con el método setTitle() el programa va a colocar el 
                texto puesto por el usuario en la parte superior de la interfaz.*/
            setTitle(texto);
        }
        
    }

    public static void main(String[] args) {
        Swing_JTextField inter = new Swing_JTextField();
        inter.setBounds(0, 0, 300, 150);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }
}
