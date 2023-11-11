package Pattern2;

public interface CarsFactory {
    Engine createEngine();
    Body createBody();
    Tires createTires();
}
