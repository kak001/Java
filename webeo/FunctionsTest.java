import java.util.Arrays;

public class FunctionsTest {
    public static void main(String[] args) {
        
        // 1.
        // Crea una función que reciba dos números enteros y devuelva el mayor de los dos.
        System.out.println(greaterThan(2, 3));
        System.out.println(greaterThan(10, 4));
        System.out.println();

        // 2.
        // Escribe un método que reciba un número y determine si es primo.
        System.out.println(primeNumber(2));
        System.out.println(primeNumber(9));
        System.out.println();

        // 3.
        // Crea una función que reciba una cadena y la retorne invertida.
        System.out.println(reversedString("kako"));
        System.out.println();

        // 4.
        // Haz un método que reciba un array de enteros y retorne el valor máximo.
        int[] numbers = {1, 20, 67, 100, 99};

        System.out.println(maxNumber(numbers));
        System.out.println();

        // 5.
        // Escribe una función que reciba un array de enteros y retorne el valor mínimo.
        int[] anotherNumbers = {2100, 653, 4444, 2, 6769};

        System.out.println(minNumber(anotherNumbers));
        System.out.println();

        // 6.
        // Crea un método que reciba un número entero y retorne la suma de sus dígitos.
        System.out.println(addDigits(12345));
        System.out.println();

        // 7.
        // Implementa una función que reciba dos cadenas y retorne true si son anagramas.
        System.out.println(isAnagram("Roma", "Amor"));
        System.out.println(isAnagram("Hello", "World"));
        System.out.println();

        // 8.
        // Crea un método que reciba un número y calcule el n-ésimo término de la serie de Fibonacci.
        System.out.println(iterativeFibonacci(7));
        System.out.println();

        // 9.
        // Escribe una función que reciba una cadena y cuente cuántas vocales contiene.
        var textA = "Programacion Orientada a Objetos (Java)";
        System.out.println(textA);
        System.out.println(countVocals(textA));
        System.out.println();

        // 10.
        // Crea un método que reciba un array de enteros y retorne un nuevo array solo con los números pares.
        int[] otherNumbers = {1, 2, 3, 4, 5};
        int[] pairs = getPairs(otherNumbers);

        System.out.println(Arrays.toString(pairs));
    }

    public static int greaterThan(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean primeNumber(int a) {
        if (a <= 1) {
            return false;
        }

        for (int index = 2; index * index <= a; index++) {
            if (a % index == 0) {
                return false;
            }
        }

        return true;
    }

    public static String reversedString(String a) {
        return new StringBuilder(a).reverse().toString();
    }

    public static int maxNumber(int[] a) {
        var maximum = a[0];
        for (int index = 0; index < a.length; index++) {
            if (a[index] > maximum) {
                maximum = a[index];
            }
        }
        return maximum;
    }

    public static int minNumber(int[] a) {
        var minimum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        return minimum;
    }

    public static int addDigits(int a) {
        a = Math.abs(a);

        var addition = 0;
        while (a > 0) {
            addition += a % 10;
            a /= 10;
        }
        return addition;
    }

    public static boolean isAnagram(String a, String b) {
        String s1 = a.replaceAll("\\s+", "").toLowerCase();
        String s2 = b.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static long iterativeFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 0) return 1;

        long a = 0;
        long b = 1;
        long additionFibonnaci = 0;

        for (int j = 2; j <= n; j++) {
            additionFibonnaci = a + b;
            a = b;
            b = additionFibonnaci;
        }
        return b;
    }

    public static int countVocals(String str) {
        int count = 0;
        String text = str.toLowerCase();

        for (int n = 0; n < text.length(); n++) {
            char c = text.charAt(n);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int[] getPairs(int[] otherNumbers) {
        return Arrays.stream(otherNumbers)
                     .filter(n -> n % 2 == 0)
                     .toArray();
    }
}
