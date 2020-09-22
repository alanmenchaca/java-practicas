package propiedadessistema;

import java.util.Enumeration;
import java.util.Properties;

public class PropiedadesSistema {

    public static void main(String[] args) {

        // Por medio de la clase System solicitamos el método getProperties(),
        // este nos va a devolver las propiedades del sistema en el cual estemos trabajando.
        Properties propiedades = System.getProperties();

        // Obtenemos cada una de las propiedades del sistema en el cual estemos trabajando
        // utilizando el método propertyNames().
        Enumeration nombrePropiedades = propiedades.propertyNames();
        /* El método nos retornará una Enumeración, la clase Enumeration nos permite iterar 
        cada uno de los elementos de una enumeración (en este caso la colección de los nombre
        de las propiedades del sistema en el que estemos trabajando. */

        // En caso de que la enumeración contenga elementos se seguirá iterando el ciclo while.
        while (nombrePropiedades.hasMoreElements()) {
            String nombrePropiedad = (String) nombrePropiedades.nextElement();

            // Por cada uno de los elementos solicitamos cada uno de los valores de la propiedad que vayamos encontrando.
            String valorPropiedad = propiedades.getProperty(nombrePropiedad);

            System.out.printf("LLave: %29s = %s%n", nombrePropiedad, valorPropiedad);
        }
    }

}
