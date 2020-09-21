package frecuenciascardiacas;

import javax.swing.JOptionPane;

public class Persona {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(null, "Nombre de la persona:");
        String apellido = JOptionPane.showInputDialog(null, "Apellido de la persona:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes de nacimiento:"));
        int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Año de nacimiento:"));
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas("Pedro", "Rodriguez", 17, 10, 2000);

        System.out.printf("Nombre: %s %s%n", persona.getNombre(), persona.getApellido());
        System.out.printf("Fecha de Nacimiento: %d / %d / %d%n", persona.getDia(),
                persona.getMes(), persona.getAño());
        System.out.printf("Edad: %d%n", persona.obtenerEdad());
        System.out.printf("Frecuencia Cardiaca Máxima\nen pulsos por minuto: %d%n", persona.fCMaxima());
        System.out.print(persona.fCEsperada());
    }
}
