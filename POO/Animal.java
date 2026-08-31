public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal() {
        this.name = "Desconocido";
        this.age = 0;
        this.weight = 0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.println("========================");
        System.out.println("DATOS DEL ANIMAL GENERICO");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Peso (Kg): " + weight);
        System.out.println("========================");
    }

    public void sound() {
        System.out.println("El animal esta haciendo un sonido generico.");
    }
}
