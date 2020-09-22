package ejemplodeabstraccion;

// Programa de prueba para la jerarquía de Empleado.
public class PruebaSistemaNomina {

    public static void main(String[] args) {

        // crea objetos de las subclases
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Jhon", "Smith", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("*** Empleados procesados por separado: ***");

        System.out.printf("%n%s%n%s: $%,.2f%n",
                empleadoAsalariado, "ingresos", empleadoAsalariado.generarIngresos());
        System.out.printf("%n%s%n%s: $%,.2f%n",
                empleadoPorHoras, "ingresos", empleadoPorHoras.generarIngresos());
        System.out.printf("%n%s%n%s: $%,.2f%n",
                empleadoPorComision, "ingresos", empleadoPorComision.generarIngresos());
        System.out.printf("%n%s%n%s: $%,.2f%n",
                empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.generarIngresos());

        // crea un arreglo Empleado de cuatro elementos
        Empleado[] empleados = new Empleado[4];

        // incializa el arreglo con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("\n*** Empleados en forma polimorfica: ***\n");

        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados) {

            System.out.println(empleadoActual); // invoca el toString

            // determina si el empleado es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {

                // conversión descendente de la referencia de Empleados
                // a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());

                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f%n",
                        empleado.getSalarioBase());
            }

            System.out.printf("Ingresos $%,.2f%n", empleadoActual.generarIngresos());
            System.out.println("----------------------------------------");
        }

        // obtiene el nombre del tipo de cada objeto con el arreglo de empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("El empleado %d es un %s%n", i, empleados[i].getClass().getName());
        }
    }
}
