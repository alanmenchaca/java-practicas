package proyectofinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JLabel label, label2, label3, label4;
    private JTextField textfield;
    private JButton boton;
    /* La palabra static indica un atributo de clase (una característica propia de la clase)
    al colocar el modificador de texto "public" indicamos que el atributo "texto" será una 
    característica publica (es accesible por cualquier clase). */
    public static String texto = "";

    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));
        /* Con el método .getImage() le decimos al programa que obtenga una imagén de la ruta 
        "images/icon.png" y con el método .getSource() le indicamos al programa que cargue la
        imagen, una ves cargada obtenemos la clase donde se cargará con el método .getClass(),
        creamos un objeto de tipo ImageIcon, y por último colocamos la imagén en el icono de la 
        interfaz gráfica con el método setIconImage() */
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        // Etiqueta (label) con una imagen dentro
        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        label = new JLabel(imagen);
        label.setBounds(25, 15, 300, 150);
        add(label);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35, 135, 300, 30);
        /* Agregamos la letra fuente (Times New Roman) con el método .setFont(new Font())
        al JLabel, ponemos el texto en negrita y cursiva colocando un 3, el texto tiendrá un 
        tamaño de 18 píxeles. */
        label2.setFont(new Font("Arial", 3, 18));
        // Elegimos el color del texto con el método .setForeground(new Color())  
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 212, 200, 30);
        // Texto en negrita
        label3.setFont(new Font("Arial", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("©2019 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Arial", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textfield = new JTextField();
        textfield.setBounds(45, 240, 255, 25);
        // Elegimos el color de fondo del JTextField con el método .setBackground()
        // JTextField con tonalidad grisácea.
        textfield.setBackground(new Color(224, 224, 224));
        /* El texto del JTextField tendrá un tamaño de 14 pixeles, 
        el tipo de letra no será negrita ni cursiva (letra normal). */
        textfield.setFont(new Font("Arial", 0, 14));
        textfield.setForeground(new Color(255, 0, 0));
        add(textfield);

        boton = new JButton("Ingresar");
        boton.setBounds(125, 280, 100, 30);
        boton.setBackground(new Color(255, 255, 255));
        boton.setFont(new Font("Arial", 1, 14));
        boton.setForeground(new Color(255, 0, 0));
        boton.addActionListener(this);
        add(boton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            /* El método .trim() elimina los espacios puestos al principio de 
            la cadena de texto*/
            texto = textfield.getText().trim();
            /* Verificamos (con el método .equals()) que la variable texto no 
            se encuentra vacía. */
            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            } else {
                Licencia ventanaLicencia = new Licencia();
                ventanaLicencia.setBounds(0, 0, 600, 360);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
                /* Con la palabra this (esta) hacemos referencia a la interfaz 
                gráfica ventanaBienvenida. */
                this.setVisible(false);
            }
        }

    }

    public static void main(String[] args) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0, 0, 350, 450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
    }

}
