public class Main {
    public static void main(String[] args) {
        var animalZero = new Animal();
        animalZero.info();
        animalZero.sound();
        System.out.println();

        var animal = new Animal("Animal generico", 4, 5);
        animal.info();
        animal.sound();
        System.out.println();

        var cat = new Cat("Arenita", 6, 8.67, "Blanco, negro y naranja");
        cat.info();
        cat.sound();
        System.out.println();

        var fish = new Fish("Darwin", 2, 0.250, true);
        fish.info();
        fish.sound();
        System.out.println();
    }
}
