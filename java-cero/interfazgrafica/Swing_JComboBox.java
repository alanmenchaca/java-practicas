package interfazgrafica;

import javax.swing.*;
import java.awt.event.*;

// Implementamos la clase ItemListener para el complemento JComboBox.
public class Swing_JComboBox extends JFrame implements ItemListener {

    private JComboBox comBox;

    public Swing_JComboBox() {
        setLayout(null);
        comBox = new JComboBox();
        comBox.setBounds(10, 10, 80, 20);
        add(comBox);

        // Creamos la lista que llevara nuestro componente JComboBox
        // El método .addItem añade un item al JComboBox
        comBox.addItem("Rojo");
        comBox.addItem("Verde");
        comBox.addItem("Azul");
        comBox.addItem("Negro");
        comBox.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comBox) {
            /* Con el método .getSelectedItem() seleccionamos el item del JComboBox
                puesto por el usuario para así convertirlo a una variable de tipo String
                con el método .toString() y asignarlo a la variable selección. */
            String seleccion = comBox.getSelectedItem().toString();
            setTitle(seleccion);
        }

    }

    public static void main(String[] args) {
        Swing_JComboBox inter = new Swing_JComboBox();
        inter.setBounds(0, 0, 200, 150);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
