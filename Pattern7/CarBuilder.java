package Pattern7;

interface CarBuilder {
    CarBuilder setBrand(String brand);
    CarBuilder setModel(String model);
    CarBuilder setColor(String color);
    CarBuilder addOption(String option);
    Car build();
}
