package creational.builder;

public class Car {
    private String plate;
    private String brand;
    private String model;
    private String color;
    private int doors;

    Car(String plate, String brand, String model, String color, int doors){
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    public String displayInfo(){
        return String.format("Plate: %s, Brand: %s, Model: %s, Color: %s, Doors: %i", plate, brand, model, color, doors) ;
    }
}
