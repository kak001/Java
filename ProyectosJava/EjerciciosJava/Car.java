public class Car {

    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showCarData() {
        System.out.println("Auto marca " + brand + " modelo " + model);
    }
}
