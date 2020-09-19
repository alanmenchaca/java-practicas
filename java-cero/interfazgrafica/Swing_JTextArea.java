package interfazgrafica;

import javax.swing.*;

public class Swing_JTextArea extends JFrame {

    /* El componente JTextArea nos permite ingresar
    multiples líneas de texto por teclado. */
    private JTextField textField;
    private JTextArea textArea;

    public Swing_JTextArea() {
        setLayout(null);
        textField = new JTextField();
        textField.setBounds(10, 10, 200, 30);
        add(textField);

        textArea = new JTextArea();
        textArea.setBounds(10, 50, 400, 300);
        add(textArea);
    }

    public static void main(String[] args) {
        Swing_JTextArea inter = new Swing_JTextArea();
        inter.setBounds(0, 0, 540, 400);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
