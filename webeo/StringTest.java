public class StringTest {
    public static void main(String[] args) {
        
        // 1.
        String fullName = "Joaquin Antonio Torrent Jara";

        System.out.println(fullName.substring(16, 23));
        System.out.println();

        // 2.
        String car = "Ferrari 458 Italia";

        System.out.println(car.indexOf("458"));
        System.out.println();

        // 3.
        // Metodo StringBuilder
        StringBuilder dj = new StringBuilder("Skrillex");

        System.out.println(dj.reverse());
        System.out.println();

        // 4.
        String jet = "Lockheed Martin F-22 Raptor";
        char desiredCharacter = 'a';
        int count = 0;

        String jetLower = jet.toLowerCase();
        char desiredCharacterLower = Character.toLowerCase(desiredCharacter);

        for (int index = 0; index < jetLower.length(); index++) {
            if (jetLower.charAt(index) == desiredCharacterLower) {
                count++;
            }
        }
        System.out.println("Cantidad de 'a' encontradas: " + count);
        System.out.println();

        // 5.
        String space = "Agujero Negro";
        String [] words = space.split(" ");

        System.out.println("Palabras obtenidas");
        for (String wordsA: words) {
            System.out.println("- " + wordsA);
        }
        System.out.println();

        // 6.
        String food1 = "pizza";
        String food2 = "PIZZA";

        System.out.println(food1.equalsIgnoreCase(food2));
        System.out.println();

        // 7.
        String csMap = "de_dust2";

        System.out.println("¿Empieza con \"de\"?: " + csMap.startsWith("de"));
        System.out.println("¿Empieza termina con \"dust2\"?: " + csMap.endsWith("dust2"));
        System.out.println();

        // 8.
        int number = 20;
        System.out.println("Numero tipo entero: " + number);
        String numberToText = String.valueOf(number);
        System.out.println("Numero tipo entero a cadena de texto: " + numberToText);
        System.out.println();

        String text = "67";
        System.out.println("Numero tipo cadena de texto: " + text);
        int textToNumber = Integer.parseInt(text);
        System.out.println("Numero tipo cadena de texto a entero: " + textToNumber);
        System.out.println();
        // Nota: en la termina no se ve la diferencia si uno es entero o cadena de texto, solo dentro del codigo y como se transforma en una u otra

        // 9.
        String cicle = "Esto es un bucle";
        
        for (int index = 0; index < 10; index++) {
            System.out.println(cicle);
        }
        System.out.println();

        // 10.
        String name = "kako";
        System.out.println("¿El nombre esta vacio?: " + name.isEmpty());
        System.out.println("¿El nombre esta en blanco?: " + name.isBlank());
        System.out.println();
    }
}
