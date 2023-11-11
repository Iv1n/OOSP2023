package Pattern3;

public class DataBaseConnected extends Connected{

    public DataBaseConnected(DataBaseLibrary library) {
        super(library);
    }


    public void connect(){
        dataBaseLibrary.conectedDB();
        dataBaseLibrary.startDB();
        System.out.println("Complited");
    }
}
