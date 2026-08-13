import java.util.Scanner;

public class NumeroPor2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero, cual se multiplicara por dos: ");
        int numero = teclado.nextInt();

        int numerox2 = numero*2;

        System.out.println("Resultado: " + numerox2);

        teclado.close();

    }
}