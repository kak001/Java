import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        // Declaracion y creacion

        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Joako");
        names.add("Torrent");
        names.add("kako");
        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar los elementos

        names.set(2, "joaco.atj06@gmail.com");
        System.out.println(names.getLast());

        // Eliminar elementos

        names.remove(2);
        // System.out.println(names.get(2)); Error

        //Buscar elementos

        System.out.println(names.contains("Joako"));
        System.out.println(names.contains("joaco.atj06@gmail.com"));
        
        // Limpiar ArrayList

        names.clear();;
        System.out.println(names.size());

        System.out.println(numbers);
    }
}
