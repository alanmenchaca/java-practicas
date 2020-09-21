package fecha;

// Fig. 8.9: PruebaEmpleado.java
// Demostración de la composición.
public class PruebaEmpleado {

    public static void main(String[] args) {

        Fecha nacimiento = new Fecha(24, 7, 1949);
        Fecha contratacion = new Fecha(12, 30, 1988);
        Empleado empleado = new Empleado("Bob", "Blue", nacimiento, contratacion);

        System.out.println(empleado);
    }

}
