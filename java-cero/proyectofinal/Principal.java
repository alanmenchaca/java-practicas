package proyectofinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar mB;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
            labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
    private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    String nombreAdministrador = "";

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida nombreBienvenida = new Bienvenida();
        nombreAdministrador = nombreBienvenida.texto;

        // BARRA DE OPCIONES
        mB = new JMenuBar();
        mB.setBackground(new Color(255, 0, 0));
        setJMenuBar(mB);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255, 0, 0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mB.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 0, 0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mB.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 0, 0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mB.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255, 0, 0));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(255, 0, 0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255, 0, 0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(255, 0, 0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(255, 0, 0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        // LABELS, JCOMBOBOX Y JTEXTAREA DE LA INTERFAZ GRÁFICA
        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el cálculo de vaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre Completo:");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new Color(224, 224, 224));
        txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new Color(255, 0, 0));
        add(txtNombreTrabajador);

        labelAPaterno = new JLabel("Apellido Paterno:");
        labelAPaterno.setBounds(25, 248, 180, 25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);

        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
        txtAPaternoTrabajador.setBackground(new Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new Color(255, 0, 0));
        add(txtAPaternoTrabajador);

        labelAMaterno = new JLabel("Nombre Materno:");
        labelAMaterno.setBounds(25, 308, 180, 25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
        txtAMaternoTrabajador.setBackground(new Color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new Color(255, 0, 0));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Selecciona el Departamento:");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new Color(244, 244, 244));
        comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new Color(255, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención al Cliente");
        comboDepartamento.addItem("Departamento de Logística");
        comboDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new Color(244, 244, 244));
        comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new Color(255, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 año de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 o más años de servicio");

        labelResultado = new JLabel("Resultado del Cálculo:");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(new Color(224, 224, 224));
        textArea.setFont(new Font("Andale Mono", 1, 11));
        textArea.setForeground(new Color(255, 0, 0));
        textArea.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(220, 333, 385, 90);
        add(scrollPane);

        labelFooter = new JLabel("©2019 The Coca-Cola Company | Todos los derechos reservados");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new Color(255, 255, 255));
        add(labelFooter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {
            String nombreTrabajador = txtNombreTrabajador.getText();
            String AP = txtAPaternoTrabajador.getText();
            String AM = txtAMaternoTrabajador.getText();
            /* Con el método .getSelectedItem() obtenemos el valor del JComboBox, y junto con
            el método .toString() convertimos a String el dato dentro del JComboBox para así
            poder guardarlo dentro de la variable Departamento. */
            String departamento = comboDepartamento.getSelectedItem().toString();
            String antiguedad = comboAntiguedad.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("")
                    || departamento.equals("") || antiguedad.equals("")) {

                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
            } else {
                if (departamento.equals("Atención al Cliente")) {

                    if (antiguedad.equals("1 año de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 6 días de vacaciones.");
                    }
                    if (antiguedad.equals("2 a 6 años de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 14 días de vacaciones.");
                    }
                    if (antiguedad.equals("7 años o más de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 20 días de vacaciones.");
                    }

                }
                if (departamento.equals("Departamento de Logística")) {

                    if (antiguedad.equals("1 año de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 7 días de vacaciones.");
                    }
                    if (antiguedad.equals("2 a 6 años de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 15 días de vacaciones.");
                    }
                    if (antiguedad.equals("7 años o más de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 22 días de vacaciones.");
                    }

                }
                if (departamento.equals("Departamento de Gerencia")) {

                    if (antiguedad.equals("1 año de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 10 días de vacaciones.");
                    }
                    if (antiguedad.equals("2 a 6 años de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 20 días de vacaciones.");
                    }
                    if (antiguedad.equals("7 años o más de servicio")) {
                        textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM
                                + "\n   quien labora en " + departamento + " con " + antiguedad
                                + "\n   recibe 30 días de vacaciones.");
                    }
                }
            }

        }
        if (e.getSource() == miRojo) {
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == miNegro) {
            getContentPane().setBackground(new Color(0, 0, 0));
        }
        if (e.getSource() == miMorado) {
            getContentPane().setBackground(new Color(51, 0, 51));
        }
        if (e.getSource() == miNuevo) {
            txtNombreTrabajador.setText("");
            txtAPaternoTrabajador.setText("");
            txtAMaternoTrabajador.setText("");
            /* El método .setSelectedIndex() nos ayuda a volver a restaurar 
           en su valor original el componente JComboBox. */
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textArea.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        }
        if (e.getSource() == miSalir) {
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0, 0, 350, 450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == miElCreador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por La Geekipedia de Ernesto\n"
                    + "       www.youtube.com/ErnestoPerezM");
        }
    }

    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 640, 535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }

}
