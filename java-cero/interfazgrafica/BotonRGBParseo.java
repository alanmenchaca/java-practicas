package interfazgrafica;

import javax.swing.*;
/* Indicamos que queremos importar todos los componentes de
diseño que tiene disponible la librería .awt */
import java.awt.*;
/* Le indicamos a la librería .awt que debe de importar todos 
los eventos disponibles que tiene dentro de si misma. */
import java.awt.event.*;

public class BotonRGBParseo extends JFrame implements ActionListener {

    private JLabel label;
    private JLabel label2, label3;
    private JComboBox comBox, comBox2, comBox3;
    private JButton boton;

    public BotonRGBParseo() {
        setLayout(null);
        label = new JLabel("Rojo:");
        label.setBounds(10, 10, 100, 40);
        add(label);

        comBox = new JComboBox();
        comBox.setBounds(120, 10, 50, 30);

        for (int i = 0; i <= 255; i++) {
            /* Manera distinta de realizar un parseo de: variable tipo
            entero a variable de tipo String */
            comBox.addItem(String.valueOf(i));
            /* El valor de la variable tipo entero "i" incrementa, añadimos
            la variable al componente JComboBox con el método .addItem() y después
            convertimos la variable tipo entero a una variable de tipo String con
            el método String.ValueOf() */
        }
        add(comBox);

        /****** LABEL 2 *****/
        label2 = new JLabel("Verde:");
        label2.setBounds(10, 50, 100, 10);
        add(label2);

        comBox2 = new JComboBox();
        comBox2.setBounds(120, 50, 50, 30);

        for (int i = 0; i <= 255; i++) {
            comBox2.addItem(String.valueOf(i));
        }
        add(comBox2);

        /****** LABEL 3 *****/
        label3 = new JLabel("Azul:");
        label3.setBounds(10, 90, 100, 10);
        add(label3);

        comBox3 = new JComboBox();
        comBox3.setBounds(120, 90, 50, 30);

        for (int i = 0; i <= 255; i++) {
            comBox3.addItem(String.valueOf(i));
        }
        add(comBox3);

        boton = new JButton("Fijar Color");
        boton.setBounds(10, 130, 100, 30);
        add(boton);
        boton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            /* El método .getSelectedItem() recupera el item seleccionado
                por el usuario, despues convertimos la variable entero a tipo String con
                el método de parseo .toString() para despúes asignarlo a la 
                variable String (cad) */
            String cad = comBox.getSelectedItem().toString();
            String cad2 = comBox2.getSelectedItem().toString();
            String cad3 = comBox3.getSelectedItem().toString();

            // Parseamos la variable String cad a variable de tipo entero.
            int rojo = Integer.parseInt(cad);
            int verde = Integer.parseInt(cad2);
            int azul = Integer.parseInt(cad3);

            /* Inicializamos el objeto Color (el cual solo elige los colores
                con variables de tipo entero) y colocamos las variables enteras
                en los tipos de color (variables convertidas de String a tipo entero.
                Por último se asigna los colores elegidos, a el objeto color. */
            Color color = new Color(rojo, verde, azul);
            /* El método .setBackground() cambia el color de fondo 
                con la tonalidad de colores que queremos utilizar. */
            boton.setBackground(color);
        }

    }

    public static void main(String[] args) {
        BotonRGBParseo inter = new BotonRGBParseo();
        inter.setBounds(0, 0, 190, 200);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
