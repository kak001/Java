import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        
        // Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Joako");
        names.add("Torrent");
        names.add("kako");
        names.add("joaco.atj06@gmail.com");
        System.out.println(names.size());

        numbers.add(1);
        numbers.add(10);
        numbers.add(100);


        // Eliminar elementos

        names.remove("Joako");
        System.out.println(names.size());

        // Buscar elementos

        System.out.println(names.contains("Joako"));
        System.out.println(names.contains("joaco.atj06@gmail.com"));

        System.out.println(names);
        names.add("kako");
        names.add("kako");
        names.add("kako");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("Chile");
        countries.add("España");
        countries.add("Japon");
        countries.add("Joako");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
        
    }
}
