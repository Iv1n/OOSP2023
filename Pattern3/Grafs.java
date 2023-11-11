package Pattern3;

public class Grafs implements DataBaseLibrary {
    @Override
    public void conectedDB() {
        System.out.println("Grafs DataBase connected");
    }

    @Override
    public void startDB() {
        System.out.println("Grafs DataBase server start");
    }
}
