import java.util.ArrayList;

public class PolymorphismEjercicios {
    public static void main(String[] args) {
        
        // 1.
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animalList: animals) {
            animalList.makeSound();
        }
        System.out.println();

        // 2.
        var shapes = new ArrayList<Shape>();
        shapes.add(new Circle(12));
        shapes.add(new Rectangle(5, 7));

        for (Shape shapesList: shapes) {
            System.out.println("Area de la figura: "+ shapesList.calculateArea());
        }
        System.out.println();
    }
    
    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    public static class Animal {
        public void makeSound() {
            System.out.println("Este animal esta haciendo un sonido propio y generico");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("¡Woof!");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("¡Meow!");
        }
    }

    public static class Cow extends Animal {
     
        @Override
        public void makeSound() {
            System.out.println("¡Moo!");
        }
    }
    
    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
    static abstract class Shape {
        public abstract double calculateArea();
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }
}
