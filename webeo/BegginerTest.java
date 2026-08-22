public class BegginerTest {
    public static void main(String[] args) {
        // 1.
        long distanceEarthSun = 149600000000L;
        System.out.println("La distancia de la tierra-sol es una UA (Unidad Astronomica).");
        System.out.println("Lo cual en metros son aproximadamente 1,49x10^11, osea: " + distanceEarthSun + " millones de metros");
        System.out.println();

        // 2.
        int hour = 20;
        int minute = 22;
        System.out.println("Hora: " + hour + ":" + minute);
        System.out.println();

        // 3.
        float product = 29.99f;
        int amount = 3;
        float total;
        System.out.println("Producto Whisky Jack Danield's Honey: $" + product);
        System.out.println("Cantidad: " + amount);
        total = product * amount;
        System.out.println("Subtotal: $" + total);
        System.out.println();

        // 4.
        final double pi = 3.14159;
        int radio = 5;
        double circleArea;
        System.out.println("Nos dan un circulo de radio " + radio + " cm, a continuacion calculamos su area");
        System.out.println("areaCirculo = pi * r^2, osea: ");
        circleArea = pi*(radio*radio);
        System.out.println("Area total del circulo: " + circleArea + " cm^2");
        System.out.println();

        // 5.
        boolean day = false;
        boolean rain = true;
        System.out.println("¿Es de dia?: " + day + " ¿Esta lloviendo?: " + rain);
        System.out.println();

        // 6.
        String varA = "";
        System.out.println("Variable antes: " + varA);
        varA = "Cazuela de carne";
        System.out.println("Variable despues: " + varA);
        System.out.println();

        // 7.
        int varB = 20;
        double varC = 6.7;
        double totalA = varB + varC;
        System.out.println("Primera variable: " + varB);
        System.out.println("Segunda variable: " + varC);
        System.out.println("Suma de ambas variables: " + totalA);
        System.out.println();

        // 8.
        double varD = 9.99;
        // Lanza un error cual basicamente el tipo de variable no hace match o no coincide con el contenido de la variable (Type mismatch)
        int varD_A = (int)varD; // Comando cast: Es la conversion explicita o implicita de un tipo de dato a otro
        System.out.println("Numero entero: " + varD_A);

        // 9.
        char mychar = '1';
        System.out.println("Esta variable no es un numero, es un caracter: " + mychar);
        System.out.println();

        // 10.
        String name = "kako";
        String lastName = "Torrent";
        System.out.println("Resultado de comparar nombre + apellido: " + (name == lastName));
        System.out.println();
        /* Explicacion: Al usar este operador no estamos comparando el contenido del texto, si no que compara la ubicacion de memoria del objeto 
        entonces siempre va ser false, incluso si su contenido sea igual. Entonces una buena practica es usar ".equal" para comparar directamente
        el contenido del texto del String.*/
    }
}
