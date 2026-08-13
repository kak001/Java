import java.util.Scanner;

public class MiPresentacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = teclado.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingresa tu carrera: ");
        String carrera = teclado.nextLine();

        System.out.println("========DATOS DEL ESTUDIANTE========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("====================================");

        teclado.close();
    }
}