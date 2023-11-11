package Pattern3;

public class NoSQL implements DataBaseLibrary {
    @Override
    public void conectedDB() {
        System.out.println("NoSQL DataBase connected");
    }

    @Override
    public void startDB() {
        System.out.println("NoSQL DataBase server start");
    }
}
