public class Fish extends Animal {
    private boolean coldWater;

    public Fish(String name, int age, double weight, boolean coldWater) {
        super(name, age, weight);
        this.coldWater = coldWater;
    }

    public boolean getColdWater() {
        return coldWater;
    }

    public void setColdWater(boolean coldWater) {
        this.coldWater = coldWater;
    }

    @Override
    public void info() {
        System.out.println("========================");
        System.out.println("DATOS DEL ANIMAL GENERICO");
        System.out.println("Nombre: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Peso (Kg): " + getWeight());
        System.out.println("¿El pez es de agua fria?: " + coldWater);
        System.out.println("========================");
    }

    @Override
    public void sound() {
        System.out.println("El pez esta burbujeando: ¡Glu Glu!");
    }
}
