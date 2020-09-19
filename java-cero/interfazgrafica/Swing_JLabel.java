package interfazgrafica;

import javax.swing.*;

public class Swing_JLabel extends JFrame {

    private JLabel label, label2;

    public Swing_JLabel() {
        setLayout(null);
        label = new JLabel("Interfaz Gráfica.");
        label.setBounds(10, 20, 300, 30);
        add(label);

        label2 = new JLabel("Versión 2.0");
        label2.setBounds(10, 100, 100, 30);
        add(label2);
    }

    public static void main(String[] args) {
        Swing_JLabel inter = new Swing_JLabel();
        inter.setBounds(0, 0, 300, 200);
        inter.setResizable(true);
        inter.setVisible(true);
        inter.setLocationRelativeTo(null);
    }

}
