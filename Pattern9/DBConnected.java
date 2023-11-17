package Pattern9;

public class DBConnected {
    private static final DBConnected INSTANCE = new DBConnected();

    private DBConnected() {
    }

    public static DBConnected getInstance() {
        System.out.println("Instance");
        return INSTANCE;
    }
}
