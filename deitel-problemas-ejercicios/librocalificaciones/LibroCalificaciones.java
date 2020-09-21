package librocalificaciones;

// Fig. 7.14: LibroCalificaciones.java
// Libro de Calificaciones que utiliza un arreglo para almacenar las
// calificaciones de una prueba.
public class LibroCalificaciones {

    private String nombreDelCurso; // nombre del curso que representa este LibroCalificaciones
    private int[] calificaciones; // arreglo de calificaciones de estudiantes.

    // constructor
    public LibroCalificaciones(String nombreDelCurso, int[] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    // método para establecer el nombre del curso
    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    // método para obtener el nombre del curso
    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    // realiza varias operaciones sobre los datos.
    public void procesarCalificaciones() {
        // imprime el arreglo calificaciones en pantalla
        imprimirCalificaciones();

        // llama al método obtenerPromedio para calcular las calificación promedio
        System.out.printf("%nEl promedio de la clase es %.2f%n", obtenerPromedio());

        // llama a los métodos obtenerMinima y obtenerMaxima
        System.out.printf("La calificación más baja es %d%nLa calificacion más"
                + " alta es %d%n%n", obtenerMinima(), obtenerMaxima());

        // llama a imprimirGraficoBarras para imprimir el gráfico de distribución
        // de calificaciones
        imprimirGraficoBarras();
    }

    // busca la calificación más baja
    public int obtenerMinima() {

        // asume que calificaciones[0] es la más baja
        int califBaja = calificaciones[0];

        // itera a través del arreglo de calificaciones
        for (int calificacion : calificaciones) {

            // si calificación es menor que califBaja, se asigna a califBaja
            if (calificacion < califBaja) {
                califBaja = calificacion; // nueva calificación más baja
            }
        }
        return califBaja;
    }

    // busca la calificación más alta
    public int obtenerMaxima() {

        // asume que calificaciones[0] es la más alta
        int califAlta = calificaciones[0];

        // itera a través del arreglo de calificaciones
        for (int calificacion : calificaciones) {

            // si calificación es mayor que califAlta, se asigna a califAlta
            if (calificacion > califAlta) {
                califAlta = calificacion; // nueva calificación más alta
            }
        }
        return califAlta;
    }

    // determina la calificación promedio de la prueba
    public double obtenerPromedio() {

        int total = 0;

        // suma las calificaciones para un estudiante
        for (int calificacion : calificaciones) {
            total += calificacion;
        }
        // devuelve el promedio de las calificaciones
        return (double) total / calificaciones.length;
    }

    // imprime grafico de barras que muestra la distribución de las calificaciones
    public void imprimirGraficoBarras() {

        System.out.println("Distribución de calificaciones:");

        // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];

        // por cada iteración, incrementa la frecuencia apropiada.
        for (int calificacion : calificaciones) {
            ++frecuencia[calificacion / 10];
        }

        // para cada frecuencia de calificación, imprime una barra en el gráfico.
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            // imprime etiqueta de barra ("00-09: ", ..., "90-99", "100: ")
            if (cuenta == 10) {
                System.out.printf("%5d ", 100);
            } else {
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
            }

            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // imprime el arreglo de calificaciones
    public void imprimirCalificaciones() {

        System.out.println("Las calificaciones son:");

        // imprime la calificación de cada estudiante
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d%n", estudiante + 1, calificaciones[estudiante]);
        }
    }
}
