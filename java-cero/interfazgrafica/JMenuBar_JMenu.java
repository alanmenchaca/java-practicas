package interfazgrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMenuBar_JMenu extends JFrame implements ActionListener {

    // JMenuBar inserta solo la barra de menu principal.
    private JMenuBar menuBar;
    // JMenu inserta una pequeña pestaña a  el JMenuBar (Opciones)
    private JMenu menu;
    // Items dentro del JMenuItem (Submenus)
    private JMenuItem menuItem, menuItem2, menuItem3;

    public JMenuBar_JMenu() {
        setLayout(null);
        menuBar = new JMenuBar();
        /* No es necesario colocar dimensiones o coordenadas, ya que
        Java coloca los componentes en la parte superior de la interfaz
        gráfica de manera automatica (los componentes se adaptan a la resolución
        o dimensiones de la interfaz gráfica) */
        setJMenuBar(menuBar);
        // Se añade JMenuBar con el método setJMenuBar (sin el método add())

        menu = new JMenu("Opciones");
        // Añadimos el menu (opciones) dentro de la barra JMenuBar.
        menuBar.add(menu);

        menuItem = new JMenuItem("Rojo");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menuItem2 = new JMenuItem("Verde");
        menuItem2.addActionListener(this);
        menu.add(menuItem2);

        menuItem3 = new JMenuItem("Azul");
        menuItem3.addActionListener(this);
        menu.add(menuItem3);
    }

    public void actionPerformed(ActionEvent e) {
        /* Creamos un contenedor (llamado fondo) adaptamos el contenedor
        con la interfaz gráfica, e indicamos al programa que nos obtenga
        todas las dimensiones y características que tiene la interfaz gráfica
        con el método .getContentPane() y que se asigne al objeto Container. */
        Container fondo = this.getContentPane();

        if (e.getSource() == menuItem) {
            fondo.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == menuItem2) {
            fondo.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == menuItem3) {
            fondo.setBackground(new Color(0, 0, 255));
        }
        
    }

    public static void main(String[] args) {
        JMenuBar_JMenu inter = new JMenuBar_JMenu();
        inter.setBounds(0, 0, 400, 300);
        inter.setVisible(true);
        inter.setLocationRelativeTo(null);
    }

}
