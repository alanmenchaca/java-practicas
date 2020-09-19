package interfazgrafica;

import javax.swing.*;
import java.awt.event.*;

public class MtdParse_Suma extends JFrame implements ActionListener {

    private JTextField textField, textField2;
    private JLabel label, label2, label3;
    private JButton boton;

    public MtdParse_Suma() {
        setLayout(null);
        label = new JLabel("Valor 1:");
        label.setBounds(50, 5, 100, 30);
        add(label);

        label2 = new JLabel("Valor 2:");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado:");
        label3.setBounds(120, 80, 100, 30);
        add(label3);

        textField = new JTextField();
        textField.setBounds(110, 10, 150, 20);
        add(textField);

        textField2 = new JTextField();
        textField2.setBounds(110, 40, 150, 20);
        add(textField2);

        boton = new JButton("Sumar");
        boton.setBounds(10, 80, 100, 30);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == boton) {
            int valor, valor2, resultado;
            /* El método Integer.parseInt() nos permite parsear un dato de tipo String
                a un dato de tipo entero (el dato es guardado en la variable valor) */
            valor = Integer.parseInt(textField.getText());
            valor2 = Integer.parseInt(textField.getText());
            // Parseo: De variable tipo String a variable de tipo entero.
            resultado = valor + valor2;

            label3.setText("Resultado: " + resultado);
        }

    }

    public static void main(String[] args) {
        MtdParse_Suma inter = new MtdParse_Suma();
        inter.setBounds(0, 0, 300, 150);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
