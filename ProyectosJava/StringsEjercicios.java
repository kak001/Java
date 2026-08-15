public class StringsEjercicios {
    public static void main(String[] args) {
        
        System.out.println("Hola " + "kako"); // 1.

        String name = "kako";

        System.out.println(name.length()); // 2.

        System.out.println(name.charAt(0)); // 3.
        System.out.println(name.charAt(name.length() - 1)); // 3.

        System.out.println(name.toUpperCase()); // 4.
        System.out.println(name.toLowerCase()); // 4.

        var thing = "Hola, esto es una prueba";

        System.out.println(thing.contains("esto")); // 5.

        var number = 21;

        System.out.println(String.format("Hola esto es %d", number)); // 6.

        thing = " Hola, esto es una prueba ";

        System.out.println(thing.trim()); // 7.

        System.out.println(thing.replace(" ", "-")); // 8.

        var a = "chao";

        var b = new String("chao");

        System.out.println(a.equals(b)); // 9.

        System.out.println(a.length() == (b.length())); // 10.
    }
}
