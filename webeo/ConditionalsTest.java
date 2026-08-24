public class ConditionalsTest {
    public static void main(String[] args) {
        
        // 1.
        int phonePrice = 70000;
        double discount;
        if (phonePrice > 50000) {
            discount = phonePrice * (1-0.1);
            System.out.println("Se ha aplicado un descuento del 10% al producto");
            System.out.println("Precio original: " + phonePrice + " | Precio actual: " + discount);
        } else {
            System.out.println("Precio del articulo: " + phonePrice);
        }
        System.out.println();

        // 2.
        String trafficLight = "Rojo";
        switch (trafficLight) {
            case "Verde":
                System.out.println("Avanze");
                break;
            case "Amarillo":
                System.out.println("Preparate");
                break;
            case "Rojo":
                System.out.println("Detente");
                break;
            default:
                System.out.println("Color no valido");
                break;
        }
        System.out.println();

        // 3.
        int year = 2026;
        if ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }
        System.out.println();

        // 4.
        double weight = 78.9;
        double height = 1.8;
        double imc = weight / (height*height);
        if (imc < 18.5) {
            System.out.println("El usuario esta bajo de peso, recomendacion, aumentar consumo carbohidratos, calorias, etc");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("El usuario esta con peso normal, recomendacion, seguir manteniendose asi");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("El usuario esta sobre su peso, recomendacion, reducir consumo de calorias, carbohidratos, etc");
        } else {
            System.out.println("El usuario esta con obesidad, recomendacion, reduccion drastica de calorias, carbohidratos, grasas, etc");
        }
        System.out.println();

        // 5.
        int seasonOfTheYear = 9;
        if (seasonOfTheYear >= 1 && seasonOfTheYear <= 3) {
            System.out.println("La estacion del año es verano");
        } else if (seasonOfTheYear >= 4 && seasonOfTheYear <= 6) {
            System.out.println("La estacion del año es otoño");
        } else if (seasonOfTheYear >= 7 && seasonOfTheYear <= 9) {
            System.out.println("La estacion del año es invierno");
        } else if (seasonOfTheYear >= 10 && seasonOfTheYear <= 12) {
            System.out.println("La estacion del año es primavera");
        } else {
            System.out.println("Numero de estacion no valido");
        }
        System.out.println();

        // 6.
        var myCharacter = 'J';
        if (Character.isLetter(myCharacter)) {
            System.out.println("El caracter es una letra");
        } else if (Character.isDigit(myCharacter)) {
            System.out.println("El caracter es un numero");
        } else {
            System.out.println("El caracter es un simbolo");
        }
        System.out.println();

        // 7.
        String password = "hola12345";

        boolean passwordLength = password.length() > 8;
        boolean passwordNumber = false;
        for (char c: password.toCharArray()) {
            if (Character.isDigit(c)) {
            passwordNumber = true;
            break;
            }
        }

        if (passwordLength && passwordNumber) {
            System.out.println("La contraseña cumple los requisitos minimos, contraseña valida");
        } else {
            System.out.println("La contraseña NO cumple los requisitos minimos, contraseña invalida");
        }
        System.out.println();

        // 8.
        int sideA = 2;
        int sideB = 3;
        int sideC = 5;

        if (sideA == sideB && sideA == sideC &&  sideB == sideC) {
            System.out.println("El tipo de triangulo segun sus mediciones es equilatero");
        } else if ((sideA == sideB) || (sideA == sideC) || (sideB == sideC)) {
            System.out.println("El tipo de triangulo segun sus mediciones es isosceles");
        } else {
            System.out.println("El tipo de triangulo segun sus mediciones es escaleno");
        }
        System.out.println();

        // 9.
        String user = "Admin";
        switch (user) {
            case "Admin":
                System.out.println("El usuario tiene acceso total a todo el sistema");
                break;
            case "Editor":
                System.out.println("El usuario tiene acceso parcial al sistema");
                break;
            case "Invitado":
                System.out.println("El usuario tiene acceso limitado al sistema");
                break;
            default:
                System.out.println("Tipo de usuario no valido");
                break;
        }

        // 10.
        int reward = 1;
        switch (reward) {
            case 1:
                System.out.println("Felicidades, has quedado en el podio, en primer puesto, has ganado la medalla de oro");
                break;
            case 2:
                System.out.println("Felicidades, has quedado en el podio, en segundo puesto, has ganado la medalla de plata");
            case 3:
                System.out.println("Felicidades, has quedado en el podio, en tercer puesto, has ganado la medalla de bronce");
            default:
                System.out.println("Buen intento, no has quedado en el podio pero has ganado un premio de consuelo");
                break;
        }
    }
}
