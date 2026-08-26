public class Vehicle {

    // Atributos
    private String brand;
    private String model;
    private String color;

    // Constructor
    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Metodos
    public void showVehicleData() {
        System.out.println("======================");
        System.out.println("DATOS DEL VEHICULO");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Color: " + color);
        System.out.println("======================");
    }

    public void carVroom() {
        System.out.println("VROOM!");
    }

    public static void main(String[] args) {
        
        // Variables
        var carA = new Vehicle("Ferrari", "458 Italia", "Rojo");

        // Ejecuta la funcion cual muestra los datos del vehiculo
        carA.showVehicleData();
        System.out.println();

        // Ejecuta la funcion cual hace la onomatopeya del sonido del auto al acelerar
        carA.carVroom();
        System.out.println();
    }
}
