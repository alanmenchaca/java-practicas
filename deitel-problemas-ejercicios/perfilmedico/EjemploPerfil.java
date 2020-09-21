package perfilmedico;

import javax.swing.JOptionPane;

public class EjemploPerfil {

    public static void main(String[] args) {

        String pNombre = JOptionPane.showInputDialog(null, "Primer nombre:");
        String apellido = JOptionPane.showInputDialog(null, "Apellido:");
        String sexo = JOptionPane.showInputDialog(null, "Sexo:");
        double alturaCM = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura en centímetros:"));
        double pesoKg = Integer.parseInt(JOptionPane.showInputDialog(null, "Peso en Kilogramos:"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes de nacimiento:"));
        int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Año de nacimiento:"));

        PerfilMedico perfil = new PerfilMedico(pNombre, apellido, sexo, alturaCM, pesoKg, dia, mes, año);

        String datos = String.format(" ~~ DATOS DEL PACIENTE ~~%nNombre:   %s %s %nSexo:         %s.%nEstatura:  %.1f cm.%n"
                + "Peso:         %.1f kg.%nEdad:         %d años.%nFecha de Nacimiento:%n %d / %d / %d%n"
                + "-----------------------------------------"
                + "%n~ FRECUENCIA CARDIACA ~%nFrecuencia Cardiaca Máxima\nen pulsos por minuto: %d%n%s"
                + "-----------------------------------------"
                + "%n~ INDICE DE MASA CORPORAL ~%nBMI: %.2f%n",
                perfil.getPNombre(), perfil.getApellido(), perfil.getSexo(), perfil.getAlturaCM(),
                perfil.getPesoKg(), perfil.obtenerEdad(), perfil.getDia(), perfil.getMes(), perfil.getAño(),
                perfil.fCMaxima(), perfil.fCEsperada(), perfil.obtenerBMI());

        datos += "-----------------------------------------\n"
                + " ~~ VALORES DE BMI ~~\n Bajo peso:  menos de 18.5\n Normal:       entre 18.5 y 24.9\n"
                + " Sobrepeso: entre 25 y 29.9\n Obeso:         30 o más";

        JOptionPane.showMessageDialog(null, datos);

    }
}
