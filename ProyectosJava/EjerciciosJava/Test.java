import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String name = "kako";
        var age = 20;
        double height = 1.80;
        char initial = 'J';
        boolean myBoolean = true;

        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Altura (Metros): " + height);
        System.out.println("Inicial: " + initial);
        System.out.println("¿Me gusta programar?: " + myBoolean);

        if (age > 18) {
            System.out.println("El usuario es mayor de edad, puede votar");
        } else if (age == 18) {
            System.out.println("El usuario tiene la edad minima para votar");
        } else {
            System.out.println("El usuario es menor de edad, no puede votar");
        }

        var listA = new ArrayList<String>();
        listA.add("Nombre: " + name);
        listA.add("Edad: " + age);
        listA.add("Altura: " + height);
        listA.add("Inicial: " + initial);
        listA.add("¿Me gusta programar?: " + myBoolean);

        System.out.println(listA);

        var listB = new HashMap<String, Integer>();
        listB.put("Nombre: " + name, age);
        listB.put("Nombre: pipe" , 19);
        listB.put("Nombre: facu", 21);
        System.out.println(listB);

        boolean companion = true;

        if (age > 15 || companion == true) {
            System.out.println("El usuario puede comprar un boleto al cine");
        } else {
            System.out.println("El usuario no puede comprar un boleto al cine");
        }

        boolean driverlicense = false;

        if (age >= 18 && driverlicense == true) {
            System.out.println("El usuario puede manejar");
        } else {
            System.out.println("El usuario no puede manejar");
        }

        if (age >= 18 && driverlicense == true || companion == false) {
            System.out.println("El usuario esta habilitado para conducir");
        } else {
            System.out.println("El usuario no esta habilitado para conducir");
        }

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
            case 7:
                System.out.println("Es domingo");
            default:
                System.out.println("El dia no es valido");
                break;
        }

        var text = "Hola %s, tienes %d años.";

        System.out.println(text.formatted(name, age));
        System.out.println(String.format("Hola %s, tienes %d años.", name, age));

        int[] listC = {1, 2, 3};

        String variable = (age >= 18)?"Mayor":"Menor";
        System.out.println(variable);

        System.out.println(listC[0]);

    }
}
