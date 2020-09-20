package ejemplos;

public class FuncionesTrigonometricas {

    public static void main(String[] args) {

        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        // SENO: El método .sin() nos permite obtener el seno de cualquier valor.        
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de " + anguloEnGrados + "° = " + resultado);
        
        // COSENO: El método .cos() nos permite obtener el coseno de cualquier valor.        
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de " + anguloEnGrados + "° = " + resultado);
        
        // TANGENTE: El método .tan() nos permite obtener la tangente de cualquier valor.        
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de " + anguloEnGrados + "° = " + resultado);

        double valorIngresado = 0.707;
        
        // ARCOCOSENO: El método .acos() nos permite obtener el arcocoseno de cualquier valor.
        anguloEnRadianes = Math.acos(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco Coseno de: " + valorIngresado + " = " + anguloEnGrados + "°");
        
        // ARCOSENO: El método .asen() nos permite obtener el arcocoseno de cualquier valor.
        anguloEnRadianes = Math.asin(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco Seno de: " + valorIngresado + " = " + anguloEnGrados + "°");
        
        // ARCOTANGENTE: El método .atan() nos permite obtener el arcocoseno de cualquier valor.
        anguloEnRadianes = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco Tangente de: " + valorIngresado + " = " + anguloEnGrados + "°");
    }
}
