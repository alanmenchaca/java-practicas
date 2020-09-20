package operaciones;
// Clase hija o clase secundaria

/* La clase hija o clase derivada, es la nueva clase, donde vamos a reutilizar los métodos y
 atributos, que se crearon en la clase padre sin necesidad de volver a escribir el mismo código
 para poder reutilizarlos.
 Es decir, con la herencia, la clase hija puede tomar las variables y funciones que tiene su
 clase padre y utilizarlas sin ningún problema. */
public class ClaseHija_Resta extends ClasePadre {

    public void restar() {
        // Atributos heredados de la clasePadre
        resultado = valor - valor2;
    }

}
