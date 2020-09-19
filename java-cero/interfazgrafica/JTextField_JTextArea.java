package interfazgrafica;

import javax.swing.*;
import java.awt.event.*;

public class JTextField_JTextArea extends JFrame implements ActionListener {

    private JTextField textField;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    private JButton boton;

    String text = "";

    public JTextField_JTextArea() {
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 10, 200, 30);
        add(textField);

        boton = new JButton("Agregar");
        boton.setBounds(250, 10, 100, 30);
        add(boton);
        boton.addActionListener(this);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 50, 400, 300);
        add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            /* Obtenemos el texto con el método .getText() que se
                encuentra en el componente JTextField, concatenamos
                un salto de línea y por último los acumulamos dentro de la
                variable tipo String (text). */
            text += textField.getText() + "\n";
            // Indicamos que queremos colocar el texto dentro del JTextArea
            textArea.setText(text);
            /* Por último, le indicamos al programa que queremos 
                limpiar por completo el componente JTextField. */
            textField.setText("");
        }

    }

    public static void main(String[] args) {
        JTextField_JTextArea inter = new JTextField_JTextArea();
        inter.setBounds(0, 0, 540, 400);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
