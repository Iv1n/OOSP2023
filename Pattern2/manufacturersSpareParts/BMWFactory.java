package Pattern2.manufacturersSpareParts;

import Pattern2.Body;
import Pattern2.CarsFactory;
import Pattern2.Engine;
import Pattern2.Tires;

public class BMWFactory implements CarsFactory {
    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public Body createBody() {
        return new BMWBody();
    }

    @Override
    public Tires createTires() {
        return new BMWTires();
    }
}
