package Pattern3;

public abstract class Connected {
    protected DataBaseLibrary dataBaseLibrary;
    public Connected(DataBaseLibrary library){
        this.dataBaseLibrary = library;
    }
    public abstract void connect();
}
