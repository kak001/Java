public class OperatorsTest {
    public static void main(String[] args) {

        // 2.
        int numberA = 2;
        int numberB = 3;
        System.out.println("Numero A antes: " + numberA);
        System.out.println("Numero A despues: " + ++numberA);
        System.out.println("Numero B antes del postfijo: " + numberB);
        System.out.println("Numero B despues del postfijo: " + numberB++);
        System.out.println("Valor real impreso del postfijo: " + numberB);
        System.out.println();

        // 3.
        int lifes = 10;
        System.out.println("Corazones actuales: " + lifes);
        System.out.println("El jugador ha recibido daño de caida");
        System.out.println("Corazones actuales: " + --lifes);
        System.out.println();

        // 4.
        int numberC = 20;
        System.out.println("Numero inicial: " + numberC);
        numberC += 67;
        System.out.println("Suma: " + numberC);
        numberC -= 50;
        System.out.println("Resta: " + numberC);
        numberC *= 3;
        System.out.println("Multiplicacion: " + numberC);
        numberC /= 4;
        System.out.println("Division: " + numberC);
        numberC %= 5;
        System.out.println("Resto: " + numberC);
        System.out.println();

        // 5.
        double grade = 6.7;
        String score = (grade >= 4.0)?"Aprobado":"Reprobado";
        System.out.println("Resultado: " + score);
        System.out.println();

        // 6.
        double numberD = 5.1;
        if (0 >= numberD && numberD >= 10) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }
        System.out.println();

        // 7.
        int numberF = 21;
        int numberG = 7;
        if (numberF + numberG > 15) {
            System.out.println("El resultado de la operacion supera el numero 15");
        } else {
            System.out.println("El resultadod de la operacion NO supera el numero 15");
        }
        System.out.println();

        // 8.
        String name = "kako";
        String nameA = "kakooo";
        boolean result;
        if (!(name.equals(nameA))) {
            result = false;
            System.out.println("¿Ambos Strings NO son iguales?: " + result);
        } else {
            result = true;
            System.out.println("¿Ambos String SON iguales?: " + result);
        }
        System.out.println();

        // 9.
        int age = 20;
        boolean dni = true;
        boolean passport = false;
        boolean authorized = true;
        // Fix
        // Forma correcta de usar los comparadores. && tiene mayor precedencia que ||
        if ((age >= 18 && (dni || passport) && !(!authorized))) {
            System.out.println("Esta persona cumple los requisitos minimos, puede votar");
        } else {
            System.out.println("Esta persona NO cumple los requisitos minimos, NO puede votar");
        }
        System.out.println();

        // 10.
        int numberH = 15;
        boolean checker;
        if (numberH % 3 == 0 && numberH % 5 == 0) {
            checker = true;
            System.out.println("¿El numero H es multiplo de 3 y de 5?: " + checker);
        } else {
            checker = false;
            System.out.println("¿El numero es multiplo de 3 y de 5?: " + checker);
        }
        System.out.println();
    }  
}
