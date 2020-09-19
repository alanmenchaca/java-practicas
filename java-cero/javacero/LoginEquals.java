package javacero;

import java.util.Scanner;

public class LoginEquals {

    public static void main(String[] args) {

        String usuario, password;
        Scanner jum = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario:");
        usuario = jum.nextLine();

        System.out.println("\nIngresa tu contraseña:");
        password = jum.nextLine();

        if (usuario.equals("Alan") && password.equals("root")) {
            System.out.println("Inicio de sesión correcto.");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }

    }

}
