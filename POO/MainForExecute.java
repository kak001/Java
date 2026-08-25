import java.nio.file.AtomicMoveNotSupportedException;

public class MainForExecute {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hola kako, buen dia");
        System.out.println();

        var animal = new Animal("Snowy", 7, "Husky Siberiano");

        System.out.println("Nombre del animal: " + animal.getName());
        System.out.println("Edad del animal: " + animal.getAge());
        System.out.println("Especie del animal: " + animal.getSpecies());
        System.out.println();

        animal.doSound();
        System.out.println();

        animal.getAnimalInfo();
        System.out.println();

        var otherAnimal = new Animal("Luna", 8, "Mestiza");
        var otherAnimalSound = new Animal("Woof!");

        otherAnimal.getAnimalInfo();
        System.out.println();

        otherAnimalSound.animalDoSound();
        System.out.println();
    }
}
