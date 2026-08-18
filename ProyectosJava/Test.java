import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        var name = "kako";

        System.out.println(name.charAt(name.length() - 1));
        System.out.println();

        var text = "Hola, esto es una prueba";
        System.out.println(text.length());
        System.out.println(text.substring(6));
        System.out.println(text.substring(6, 17));
        System.out.println();

        System.out.println(text.toUpperCase());
        System.out.println(text.contains("Hola"));
        System.out.println(text.contains("hola"));
        System.out.println(text.contains("esto"));
        System.out.println(text.equalsIgnoreCase("Esto"));
        System.out.println();

        var age = 20;
        String result = (age >= 18)?"¿El usuario es mayor de edad?: " + true:"¿El Usuario es mayor de edad?: " + false;
        System.out.println(result);
        System.out.println();

        int[] numbersA = {1, 2, 3};

        System.out.println(numbersA[0]);
        System.out.println();

        System.out.println(numbersA.length);
        System.out.println();

        var stringsA = new ArrayList<String>();

        System.out.println(stringsA.size());
        System.out.println();

        stringsA.add("kako");
        stringsA.add("joako");
        stringsA.add("Joaquin");

        System.out.println(stringsA.getFirst());
        System.out.println(stringsA.getLast());
        System.out.println(stringsA.get(1));
        System.out.println();

        stringsA.set(1, "joaco.atj06@gmail.com");
        System.out.println(stringsA);
        System.out.println();

        System.out.println(stringsA.contains("kako"));
        System.out.println(stringsA.contains("joako"));
        System.out.println();

        stringsA.clear();
        System.out.println(stringsA);
        System.out.println(stringsA.size());
        System.out.println();
        
        var stringsB = new HashSet<String>();

        stringsB.add("kako");
        stringsB.add("joako");
        stringsB.add("Joaquin");
        System.out.println(stringsB.size());
        System.out.println(stringsB);
        System.out.println();

        var stringsC = new HashMap<String, Integer>();

        stringsC.put("kako", 957205312);
        stringsC.put("lili", 998838964);
        stringsC.put("pato", 51892079);
        System.out.println(stringsC);
        System.out.println();

        System.out.println(stringsC.get("kako"));
        System.out.println(stringsC.containsKey("kako")); 
        System.out.println(stringsC.containsValue(957205312));
        System.out.println();

    }
}
