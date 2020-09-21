package problemasdeitel;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Pedro", "Hernandez", 6400);
        Empleado emp2 = new Empleado("Juan", "Martinez", 5400);

        System.out.println("-  Empleado 1:  -\nNombre: " + emp1.getNombre());
        System.out.println("Apellido patero: " + emp1.getApellidoP());
        System.out.println("Salario mensual: " + emp1.getSalario());
        System.out.println("Salario anual: " + (emp1.getSalario() * 12));

        System.out.println("\n-  Empleado 2:  -\nNombre: " + emp2.getNombre());
        System.out.println("Apellido patero: " + emp2.getApellidoP());
        System.out.println("Salario mensual: " + emp2.getSalario());
        System.out.println("Salario anual: " + (emp2.getSalario() * 12));

        System.out.println("\nPorcentaje de incremento\n en salarios: %10");
        emp1.setSalario(emp1.getSalario() + (emp1.getSalario() * 10) / 100);
        System.out.println("Empleado1, salario anual: " + emp1.getSalario());
        emp2.setSalario(emp2.getSalario() + (emp2.getSalario() * 10) / 100);
        System.out.println("Empleado2, salario anual: " + emp2.getSalario());
    }
}
