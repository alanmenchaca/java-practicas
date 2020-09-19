package interfazgrafica;

import javax.swing.*;

public class Swing_JScrollPane extends JFrame {

    /* El componente JScrollPane nos permite recorrer el contenido que está
    dentro del JTextArea. */
    private JTextField textField;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public Swing_JScrollPane() {
        setLayout(null);
        textField = new JTextField();
        textField.setBounds(10, 10, 200, 30);
        add(textField);

        textArea = new JTextArea();
        /* Indicamos que el componente JTextArea se ubique dentro del
        JScrollPane */
        scrollPane = new JScrollPane(textArea);
        // Colocamos el objeto JTextArea dentro del componente JScrollPane
        scrollPane.setBounds(10, 50, 400, 300);
        add(scrollPane);
    }

    public static void main(String[] args) {
        Swing_JScrollPane inter = new Swing_JScrollPane();
        inter.setBounds(0, 0, 540, 400);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
