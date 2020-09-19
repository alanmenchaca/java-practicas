package polimorfismo;

public class Resta_ClaseHija extends Operaciones_ClasePadre {
    
    @Override
    public void operaciones(){
        resultado = valor - valor2;
    }
}
