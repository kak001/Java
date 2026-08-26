public class Animal {

    // Atributos
    private String names;
    private int age;
    private String species;

    // Constructor
    public Animal(String name, int age, String species) {
        this.names = name;
        this.age = age;
        this.species = species;
    }

    // Metodos
     public void showAnimalInfo() {
        System.out.println("Datos del animal");
        System.out.println("Nombre del animal: " + names);
        System.out.println("Edad del animal: " + age);
        System.out.println("Raza del animal: " + species);
    }

    public void doSound() {
        System.out.println(names + " Esta haciendo un sonido generico");
    }

    // Getters
    public String getName() {
        return names;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Setters
    public void setName(String names) {
        this.names = names;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Clase hija: Perro
    public static class Dog extends Animal {
        public Dog(String names, int age, String species) {
            super(names, age, species);
        }

        @Override
        public void doSound() {
            System.out.println("Woof!");
        }
    }

    // Clase hija: Gato
    public static class Cat extends Animal {
        public Cat(String names, int age, String species) {
            super(names, age, species);
        }
        @Override
        public void doSound() {
            System.out.println("Meow!");
        }
    }

    public static void main(String[] args) {
        var dog = new Dog("Rex", 2, "Husky Siberiano");

        dog.doSound();
        System.out.println();

        var cat = new Cat("Arenita", 6, "Calico");

        cat.doSound();
        System.out.println();
    }
}
