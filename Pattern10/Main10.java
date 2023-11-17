package Pattern10;

public class Main10 {
    public static void main(String[] args){
        CarSystemFacade carSystemFacade = new CarSystemFacade();

        carSystemFacade.startCar();
        System.out.println("");
        carSystemFacade.stopCar();
    }
}
