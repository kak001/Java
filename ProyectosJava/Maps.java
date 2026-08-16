import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaracion y creacion
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("kako", "joaco.atj06@gmail.com");
        names.put("Joako", "joaco.tj206@gmail.com");
        names.put("Joaquin", "donhuevoxd2100@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos

        System.out.println(names.get("kako"));
        System.out.println(names.get("ola"));

        // Verificar elementos
        
        System.out.println(names.containsKey("kako"));
        System.out.println(names.containsKey("ola"));

        System.out.println(names.containsValue("joaco.atj06@gmail.com"));

        // Eliminar elementos

        System.out.println(names.remove("kako"));
        System.out.println(names.remove("Joako"));
        System.out.println(names);

        // Limpiar HashMap

        names.clear();
        System.out.println(names);

        // Otras operaciones

        names.put("kako", "joaco.atj06@gmail.com");
        System.out.println(names);

        names.put("kako", "joaco.tj206@gmail.com");
        System.out.println(names);

        names.replace("Joako", "joaco.atj206@gmail.com"); // Reemplaza el valor solo si existe
        System.out.println(names);

        names.putIfAbsent("Joako", "joaco.atj206@gmail.com"); // Añade el valor solo si no existe
        System.out.println(names);

        System.out.println(names.isEmpty());
        System.out.println(names.values());

        var values = names.values();
        System.out.println(values);

        System.out.println(numbers);
        
    }
}
