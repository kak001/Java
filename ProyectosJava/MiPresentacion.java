import java.util.Scanner;

public class MiPresentacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingresa la carrera que estas estudiando: ");
        String carrera = teclado.nextLine();

        System.out.println("Ingresa el semestre que estas cursando: ");
        int semestre = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Registrando datos del estudiante...");
        System.out.println();

        System.out.println("=======================================");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Año 2026, semestre: " + semestre);
        System.out.println("=======================================");

        teclado.close();
    }
}
