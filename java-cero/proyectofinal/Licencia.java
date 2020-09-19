package proyectofinal;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label, label2;
    private JCheckBox check;
    private JButton boton, boton2;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    String nombre = "";

    public Licencia() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        // Objeto creado de la clase Bienvenida
        Bienvenida nombreBienvenida = new Bienvenida();
        nombre = nombreBienvenida.texto;

        label = new JLabel("TÉRMINOS Y CONDICONES");
        label.setBounds(215, 5, 200, 30);
        label.setFont(new Font("Andale Mono", 1, 14));
        label.setForeground(new Color(0, 0, 0));
        add(label);

        textArea = new JTextArea();
        /* Con el método .setEditable() indicamos si queremos que el contenido (texto) del 
        JTextArea, pueda ser editado por el usuario. */
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono", 0, 9));
        textArea.setText("\n\n          TÉRMINOS Y CONDICIONES"
                + "\n\n            A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO."
                + "\n            B. PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."
                + "\n            C. LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."
                + "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"
                + "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO). NO SE RESPONSABILIZAN DEL USO QUE USTED"
                + "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLICK EN (ACEPTO)"
                + "\n          SI USTED NO ACEPTA ESTOS TÉRMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."
                + "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, PORFAVOR VISITE"
                + "\n          https://www.youtube.com/ernestoperezm");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 40, 575, 200);
        add(scrollPane);

        check = new JCheckBox("Yo " + nombre + " acepto");
        check.setBounds(10, 250, 300, 30);
        check.addChangeListener(this);
        add(check);

        boton = new JButton("Continuar");
        boton.setBounds(10, 290, 100, 30);
        boton.setEnabled(false);
        boton.addActionListener(this);
        add(boton);

        boton2 = new JButton("No acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.setEnabled(true);
        boton2.addActionListener(this);
        add(boton2);

        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
    }

    public void stateChanged(ChangeEvent a) {
        /* Si el JCheckBox es seleccionado o está activado, se ejecutara el cuerpo de 
        la estructura condicional. */
        if (check.isSelected() == true) {
            boton.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            boton.setEnabled(false);
            boton2.setEnabled(true);
        }

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 640, 535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);     
        this.setVisible(false);
        } else if (e.getSource() == boton2) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0, 0, 350, 450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
        this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0, 0, 600, 360);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);

    }

}
