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

        // RPG
        var mage = new Mage("Vincent", 27, 100, "Normal", 65);
        mage.info();
        mage.attack();
        mage.lightningAttack();
        mage.blizzardAttack();
        System.out.println();

        var healer = new Healer("Aurora", 19, 115, "Normal", 45);
        healer.info();
        healer.attack();
        healer.heal();
        healer.cure();
        healer.blessing();
        System.out.println();

        var archer = new Archer("Diana", 65, 75, "Normal", 35);
        archer.info();
        archer.attack();

        var warrior = new Warrior("Rex", 85, 150, "Normal");
        warrior.info();
        warrior.attack();
        warrior.parry();
        warrior.justiceHability();
        System.out.println();

        var finalBoss = new FinalBoss("Gwyn", 100, 200, "Fuerte");
        finalBoss.info();
        finalBoss.attack();
        finalBoss.poison();
        finalBoss.mortalHit();
    }
}
