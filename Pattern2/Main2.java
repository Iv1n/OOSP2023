package Pattern2;

import Pattern2.manufacturersSpareParts.BMWFactory;
import Pattern2.manufacturersSpareParts.PorsheFactory;

public class Main2 {
    public static void main(String[] args){

        BMWFactory bmwFactory = new BMWFactory();
        bmwFactory.createBody();
        bmwFactory.createEngine();
        bmwFactory.createTires();

        System.out.println("");

        PorsheFactory porsheFactory = new PorsheFactory();
        porsheFactory.createBody();
        porsheFactory.createEngine();
        porsheFactory.createTires();
    }
}
