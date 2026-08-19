import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {

        // for

        // Array

        String[] names = {"kako", "joako", "Joaquin", "joaco.atj06@gmail.com"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        System.out.println();

        var numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(21);
        numbers.add(67);

        // for-each

        // ArrayList

        for (Integer numbersA: numbers) {
            System.out.println(numbersA);
        }
        System.out.println();

        //HashSet

        var ages = new HashSet<Integer>();
        ages.add(20);
        ages.add(19);
        ages.add(21);

        for (Integer agesA: ages) {
            System.out.println(agesA);
        }
        System.out.println();

        // HashMap

        var contacts = new HashMap<String, Integer>();

        contacts.put("kako", 2006);
        contacts.put("lili", 1975);
        contacts.put("pato", 1976);

        for (Map.Entry<String, Integer> contactsA: contacts.entrySet()) {
            System.out.println(contactsA.getKey());
            System.out.println(contactsA.getValue());
        }
        System.out.println();

        // while

        int i = 0;
        while (i < 5) {
            System.out.println("Hola, Java!");
            i++;
        }
        System.out.println();

        i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }
        System.out.println();

        i = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[i]);
            if (names[i].equals("Joaquin")) {
                find = true;
            }
            i++;
        } 
        System.out.println();

        // do-while

        i = 0;
        find = false;
        do {
            System.out.println(names[i]);
            if (names[i].equals("kako")) {
                find = true;
            }
            i++;
        } while (!find);
        System.out.println();

        
    }
}
