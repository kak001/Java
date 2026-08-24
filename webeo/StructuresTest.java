import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StructuresTest {
    public static void main(String[] args) {
        
        // 1.
        int[] numbersArray = {1, 20, 67, 100, 57};
        int totalNumbersArray = 0;
        for (Integer numbersArrayA: numbersArray) {
            totalNumbersArray += numbersArrayA;
        }
        System.out.println("Suma total: " + totalNumbersArray);
        System.out.println();

        // 2.
        int[] numbersHighAndLowValue = {20, 2100, 99, 1372, 653};

        int minimum = numbersHighAndLowValue[0];
        int maximum = numbersHighAndLowValue[0];

        for (int index = 1; index < numbersHighAndLowValue.length; index++) {
            if (numbersHighAndLowValue[index] < minimum) {
                minimum = numbersHighAndLowValue[index];
            }
            if (numbersHighAndLowValue[index] > maximum) {
                maximum = numbersHighAndLowValue[index];
            }
        }

        System.out.println("Valor mas alto: " + maximum);
        System.out.println("Valor mas bajo: " + minimum);
        System.out.println();

        // 3.
        // Array Bidimencional (Matriz)
        int[][] matrix = {
            {1, 2, 3},
            {20, 21, 67},
            {100, 99, 20000}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 4.
        var names = new ArrayList<String>(Arrays.asList("kako", "joako", "Joaquin"));

        for (String namesA: names) {
            System.out.println("Nombre: " + namesA);
        }
        System.out.println();

        // 5.
        var years = new ArrayList<Integer>(Arrays.asList(2006, 2010, 1975, 1976));

        System.out.println("Antes de ordenar los numeros");
        for (Integer yearsA: years) {
            System.out.println(yearsA);
        }
        System.out.println();

        Collections.sort(years);

        System.out.println("Despues de ordenar los numeros");
        for (Integer yearsB: years) {
            System.out.println(yearsB);
        }
        System.out.println();

        // 6.
        var findCar = false;
        var cars = new ArrayList<String>(Arrays.asList("Ferrari 458 Italia", "Porsche 911 GT3 RS", "Volkswagen Golf GTI"));

        for (String carsA: cars) {
            if (carsA.contains("Ferrari 458 Italia")) {
                findCar = true;
            }
        }
        System.out.println("¿Se encontro el vehiculo buscado?: " + findCar);
        System.out.println();

        // 6.1
        // HashSet
        var findSatellite = false;
        var satellite = new HashSet<String>(Set.of("James Webb", "Hubble", "Voyager2"));
       
        for (String satelliteA: satellite) {
            if (satelliteA.contains("James Webb")) {
                findSatellite = true;
            }
        }
        System.out.println("¿Se encontro el satelite buscado?: " + findSatellite);
        System.out.println();

        // 7.
        var footballPlayers = new HashSet<String>(Set.of("Cristiano Ronaldo", "Lionel Messi", "Neymar Junior"));
        var moreFootballPlayers = new HashSet<String>(Set.of("Lamine Yamal", "Erling Haaland", "Kylian Mbappe", "Lionel Messi", "Cristiano Ronaldo"));

        footballPlayers.addAll(moreFootballPlayers);

        for (String totalFootballPlayers: footballPlayers) {
            System.out.println("Nombre del jugador: " + totalFootballPlayers);
        }
        System.out.println();

        // 8.
        var artistMusicGender = new HashMap<String, String>(Map.of(
            "Nvscvr", "Trap",
            "Skrillex", "Dubstep",
            "Arcangel", "Reggeaton"
        ));

        for (Map.Entry<String, String> artistMusicGenderA: artistMusicGender.entrySet()) {
            System.out.println("Artista: " + artistMusicGenderA.getKey() + " | Genero musical: " + artistMusicGenderA.getValue());
        }
        System.out.println();

        // 9.
        var findFood = false;
        var foodFranchise = new HashMap<String, String>(Map.of(
            "McDonald's", "Hamburguesas",
            "Little Caesars", "Pizzas",
            "KFC", "Pollo frito"
        ));

        if (foodFranchise.containsKey("Little Caesars")) {
            findFood = true;
            System.out.println("¿Existe la clave \"Little Caesars\" dentro de las franquicias de comida?: " + findFood);
            System.out.println("Tipo de franquicia: " + foodFranchise.get("Little Caesars"));
        } else {
            System.out.println("No se encontro la clave \"Little Caesars\"");
        }
        System.out.println();

        // 10.
        var totalMath = 0.0;
        var totalLanguage = 0.0;
        var totalScience = 0.0;
        var math = new ArrayList<Double>(Arrays.asList(6.7, 7.0, 6.5));
        var language = new ArrayList<Double>(Arrays.asList(6.0, 5.9, 6.9));
        var science = new ArrayList<Double>(Arrays.asList(7.0, 6.0, 5.0));
        var subjectMatter = new HashMap<String, ArrayList>(Map.of(
            "Lenguaje", language,
            "Matematicas", math,
            "Ciencias", science
        ));

        for (Map.Entry<String, ArrayList> grades: subjectMatter.entrySet()) {
            System.out.println("Materia: " + grades.getKey() + " | Notas: " + grades.getValue());
        }
        System.out.println();

        for (Double totalMathGrades: math) {
            totalMath += totalMathGrades;
        }

        for (Double totalLanguageGrades: language) {
            totalLanguage += totalLanguageGrades;
        }

        for (Double totalScienceGrades: science) {
            totalScience += totalScienceGrades;
        }

        var averageMathGrades = totalMath / math.size();
        var averageLanguageGrades = totalLanguage / language.size();
        var averageScienceGrades = totalScience / science.size();

        var totalSubjectMattersGrades = new HashMap<String, Double>(Map.of(
            "Lenguaje", averageLanguageGrades,
            "Matematicas", averageMathGrades,
            "Ciencias", averageScienceGrades
        ));

        for (Map.Entry<String, Double> allAverageSubjectMatter: totalSubjectMattersGrades.entrySet()) {
            System.out.println("Promedio " + allAverageSubjectMatter.getKey() + ": " + allAverageSubjectMatter.getValue());
        }
        System.out.println();
    }
}
    