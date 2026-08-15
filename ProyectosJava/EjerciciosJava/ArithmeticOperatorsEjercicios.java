public class ArithmeticOperatorsEjercicios {
    public static void main(String[] args) {
        var a = 5;

        System.out.println(a + 1);
        System.out.println(a - 1);
        System.out.println(a * 2);
        System.out.println(a / 5);

        a = 8;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        a %= 5;
        System.out.println(a);

        a = 5;
        System.out.println(a == 5);
        System.out.println(a < 10);
        System.out.println(a >= 2);

        System.out.println(a == 10);
        System.out.println(a < 2);
        System.out.println(a >= 6);

        System.out.println(true && false); // Es false

        System.out.println(false || true); // Es true

        System.out.println(false || true); // (false && true) es false y (fasle || true) es true

        System.err.println(!(a == 5));

        System.err.println(-a); // Es -5
        System.out.println(a++); // Es 6 pero primero imprime el numero y despues lo suma
        System.err.println(a); 
        System.err.println(--a); // Es 4 pero primero descuenta y despues imprime el resultado

        System.out.println(((a = a*2 + 4) >= 10) || false); // Operacion con operadores aritmeticos, comparacion y logicos
    }
}