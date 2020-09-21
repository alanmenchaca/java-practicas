package problemasdeitel;

public class Fecha {

    private int mes;
    private int dia;
    private int año;

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.año = anio;
    }
    
    public void mostrarFecha(){
        System.out.println("Fecha: " + getDia() + " / " 
                + getMes() + " / " + getAño());
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
