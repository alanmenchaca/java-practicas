package problemasdeitel;

public class Empleado {

    private String nombre; // primer nombre
    private String apellidoP; // appellido paterno
    private double salario; // salario mensual

    public Empleado(String nombre, String apellidoP, double salario) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
