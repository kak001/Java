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

        // 3.
        var varA = new Printer();
        System.out.println("Mi nombre: " + varA.print("kako"));

        var varB = new Printer();
        System.out.println("Mi edad: " + varB.print(20));

        var varC = new Printer();
        System.out.println("Numero Pi (Aproximado): " + varC.print(3.14));

        var varD = new Printer();
        System.out.println("Mi inicial: " + varD.print('J'));

        var varE = new Printer();
        System.out.println("¿Me gusta programar?: " + varE.print(true));
        System.out.println();

        // 4.
        var greeter = new Greeter();
        greeter.greet();
        System.out.println(greeter.greet("kako"));
        System.out.println();

        // 5.
        var vehicle = new Vehicle();
        vehicle.start();

        var vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle vehicle2: vehicles) {
            vehicle2.start();
        }
        System.out.println();

        // 6
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
    
    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
    public static class Printer {
        public String print(String a) {
            return a;
        }

        public int print(int b) {
            return + b;
        } 
        
        public double print(double c) {
            return c;
        }

        public char print(char d) {
            return d;
        }

        public boolean print(boolean e) {
            return e;
        }
    }
    
    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
    public static class Greeter {
        public void greet() {
            System.out.println("Hello");
        }

        public String greet(String name) {
            return "Hello, " + name;
        } 
    }
    
    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
    public static class Vehicle {
        public void start() {
            System.out.println("El vehiculo esta arrancando");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("El automovil esta arrancando");
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("La motocicleta esta arrancando");
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.err.println("El camiendo esta arrancando");
        }
    }

    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
}
