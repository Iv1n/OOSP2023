package Pattern3;

public class SQL implements DataBaseLibrary {
    @Override
    public void conectedDB() {
        System.out.println("SQL DataBase connected");
    }

    @Override
    public void startDB() {
        System.out.println("SQL DataBase server start");
    }
}
