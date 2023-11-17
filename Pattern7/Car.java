package Pattern7;

import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String color;
    private List<String> options;

    public Car(String brand, String model, String color, List<String> options) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.options = options;
    }

    @Override
    public String toString() {
        return brand + " " + model + "" + color + " with options: " + String.join(",", options);
    }


}
