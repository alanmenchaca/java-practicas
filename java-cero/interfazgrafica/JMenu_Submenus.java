package interfazgrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenu_Submenus extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    // 3 Menus dentro del JMenuBar
    private JMenu menu, menu2, menu3;
    private JMenuItem menuItem, menuItem2, menuItem3, menuItem4;

    public JMenu_Submenus() {
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu = new JMenu("Opciones");
        menuBar.add(menu);
        // Submenu número 2
        menu2 = new JMenu("Tamaño de la ventana");
        /* Se añade el menu2 dentro del menu, para así crear un Submenu
        (un menu dentro de otro menu) */
        menu.add(menu2);

        menu3 = new JMenu("Color de fondo");
        menu.add(menu3);

        // 2 JMenuItem dentro de 1 submenu (Tamaño de la ventana)
        menuItem = new JMenuItem("300*200 pixeles");
        menu2.add(menuItem);
        menuItem.addActionListener(this);

        menuItem2 = new JMenuItem("640*480 pixeles");
        menu2.add(menuItem2);
        menuItem2.addActionListener(this);

        // 2 JMenuItem dentro de 1 submenu (Color de fondo)
        menuItem3 = new JMenuItem("Rojo");
        menu3.add(menuItem3);
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("Verde");
        menu3.add(menuItem4);
        menuItem4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem) {
            // Método para cambiar las dimensiones de una interfaz gráfica.
            setSize(300, 200);
            // Las dimensiones cambiaran al efectuar el evento.
        }
        if (e.getSource() == menuItem2) {
            setSize(640, 480);
        }
        if (e.getSource() == menuItem3) {
            /* Forma distinta y directa de cambiar el color de fondo de una
                interfaz gráfica utilizando el método getContentPane() para obtener
                el contennido de la interfaz y agregarle un color de fondo con el 
                método .serBackground(new Color()) */
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == menuItem4) {
            getContentPane().setBackground(new Color(0, 255, 0));
        }

    }

    public static void main(String[] args) {
        JMenu_Submenus inter = new JMenu_Submenus();
        inter.setBounds(0, 0, 300, 200);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

}
