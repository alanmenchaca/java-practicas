package interfazgrafica;

import javax.swing.*;
// Seleccionamos el paquete de los eventos utilizados en la librería swing.
import javax.swing.event.*;

    /* Implementamos la clase ChangeListener, la clase nos permite estar a
    la esucha o a la espera de eventos que son producidos desde un JCheckBox. */
public class Swing_JCheckBox extends JFrame implements ChangeListener {

    private JCheckBox check, check2, check3;

    public Swing_JCheckBox() {
        setLayout(null);
        /* Se le agrega la frase o texto a la opción (sin la necesidad
        de utilizar una etiqueta (label) */
        check = new JCheckBox("Inglés");
        check.setBounds(10, 10, 150, 30);
        check.addChangeListener(this);
        add(check);

        check2 = new JCheckBox("Francés");
        check2.setBounds(10, 50, 150, 30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("Alemán");
        check3.setBounds(10, 90, 150, 30);
        check3.addChangeListener(this);
        add(check3);
    }

    public void stateChanged(ChangeEvent e) {
        String cad = "";
        /* Si el componente check es seleccionado (utilizando el método .isSelected()
            se efectuará lo que está dentro de la estructura condicional
            (se comprueba con el booleano true)*/
        if (check.isSelected() == true) {
            /* Se concatena la palabra Inglés junto a la cadena de texto cad,
                utilizando un acumulador. */
            cad += "Inglés-";
        }
        if (check2.isSelected() == true) {
            cad += "Francés-";
        }
        if (check3.isSelected() == true) {
            cad += "Alemán";
        }
        setTitle(cad);
    }

    public static void main(String[] args) {
        Swing_JCheckBox inter = new Swing_JCheckBox();
        inter.setBounds(0, 0, 350, 200);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
