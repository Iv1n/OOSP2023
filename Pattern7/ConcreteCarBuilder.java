package Pattern7;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCarBuilder implements CarBuilder{
    private String brand;
    private String model;
    private String color;
    private List<String> options;

    public ConcreteCarBuilder() {
        this.options = new ArrayList<>();
    }

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder addOption(String option) {
        this.options.add(option);
        return this;
    }

    @Override
    public Car build() {
        return new Car(brand, model, color, options);
    }
}
