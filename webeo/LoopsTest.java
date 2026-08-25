import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopsTest {
    public static void main(String[] args) {
        
        // 1.
        // Imprime solo los números pares del 1 al 30 usando un bucle for.
        for (int index = 1; index <= 30; index++) {
            if (index % 2 == 0) {
                System.out.println(index);
            }
        }
        System.out.println();

        // 2.
        // Usa while para calcular la tabla de multiplicar de un número ingresado por el usuario (1 al 10).
        // Fix
        var number = 5;
        var i = 1;
        while ( i <= 10) {
            var totalNumber = number * i;
            System.out.println(number + " Multplicado por " + i + " : " + totalNumber);
            i++;
        }
        System.out.println();

        // 3.
        // Recorre un Array de Strings e imprime cada palabra junto con su longitud.

        String[] names = {"kako", "joako", "Joaquin"};

        for (String namesLength: names) {
            System.out.println("Nombre: " + namesLength + " | Longitud: " + namesLength.length());
        }
        System.out.println();

        // 4.
        // Usa un for anidado para imprimir un triángulo de asteriscos de 5 filas.
        var row = 5;

        for (int j = 1; j <= row; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5.
        // Calcula el promedio de los elementos de un ArrayList<Double> usando for-each.
        var math = new ArrayList<Double>(Arrays.asList(7.0, 6.7, 6.5));
        double totalMath = 0;

        for (Double mathA : math) {
            totalMath += mathA;
        }
        
        var averageMath = totalMath / math.size();

        System.out.println("Promedio Matematicas: " + averageMath);
        System.out.println();

        // 6.
        // Usa do-while para pedir números al usuario hasta que ingrese un 0, y suma todos los valores ingresados.
        var teclado = new Scanner(System.in);
        var totalNumbers = 0;
        int numberA;

        do {
            System.out.println("Ingresa un numero: ");
            numberA = teclado.nextInt();

            totalNumbers += numberA;

            System.out.println("Numero " + numberA + " ingresado, total: " + totalNumbers);
        } while (numberA != 0);
        teclado.close();

        // 7.
        // Recorre un Array de enteros y encuentra el valor máximo y el mínimo usando un solo bucle.
        int[] numbers = {2, 20, 67, 100, 99};
        var minimum = numbers[0];
        var maximum = numbers[0];

        for (int m = 0; m < numbers.length; m++) {
            if (numbers[m] < minimum) {
                minimum = numbers[m];
            }
            if (numbers[m] > maximum) {
                maximum = numbers[m];
            }
        }
        System.out.println("Valor mas alto: " + maximum);
        System.out.println("Valor mas bajo: " + minimum);
        System.out.println();

        // 8.
        // Usa un for para invertir el contenido de un Array (sin usar métodos de librería) e imprímelo.
        String[] languages = {"Java", "Python", "C++"};

        for (int n = 0; n < languages.length / 2; n++) {
            String temp = languages[n];
            languages[n] = languages[languages.length - 1 - n];
            languages[languages.length - 1 - n] = temp;
        }

        for (int p = 0; p < languages.length; p++) {
            System.out.println(languages[p]);
        }
        System.out.println();

        // 9.
        // Cuenta cuántos números primos hay entre el 1 y el 100 usando bucles anidados.
        int cantidadPrimos = 0;
        i = 0;

        for (i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                cantidadPrimos++;
            }
        }
        System.out.println("Hay " + cantidadPrimos + " números primos entre 1 y 100.");
        System.out.println();

        // 10
        // Usa un bucle for-each sobre un HashMap<String, Integer> para imprimir solo las claves cuyo valor sea mayor a un umbral dado.
        var productos = new HashMap<String, Integer>(Map.of(
            "Platanos", 5,
            "Naranjas", 25,
            "Uvas", 10
        ));

        int umbral = 10;

        for (Map.Entry<String, Integer> entrada : productos.entrySet()) {
            if (entrada.getValue() > umbral) {
                System.out.println(entrada.getKey()); 
            } 
        }
    }
}
