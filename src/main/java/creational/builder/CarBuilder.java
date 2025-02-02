package creational.builder;

public class CarBuilder {
    private String plate;
    private String brand;
    private String model;
    private String color;
    private int doors;

    public CarBuilder plate(String plate) {
        this.plate = plate;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder doors(int doors) {
        this.doors = doors;
        return this;
    }

    public Car buildCar() {
        return new Car(plate, brand, model, color, doors);
    }
}
