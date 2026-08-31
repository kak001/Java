public class Cat extends Animal {
    private String fur;

    public Cat(String name, int age, double weight, String fur) {
        super(name, age, weight);
        this.fur = fur;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public void info() {
        System.out.println("========================");
        System.out.println("DATOS DEL ANIMAL GENERICO");
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Peso (Kg): " + getWeight());
        System.out.println("Color del pelaje: " + fur);
        System.out.println("========================");
    }

    @Override
    public void sound() {
        System.out.println("El gato esta maullando: ¡Meow!");
    }
}
