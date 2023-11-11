package Pattern2.manufacturersSpareParts;

import Pattern2.Body;
import Pattern2.CarsFactory;
import Pattern2.Engine;
import Pattern2.Tires;

public class PorsheFactory implements CarsFactory {
    @Override
    public Engine createEngine() {
        return new PorsheEngine();
    }

    @Override
    public Body createBody() {
        return new PorsheBody();
    }

    @Override
    public Tires createTires() {
        return new PorsheTires();
    }
}
