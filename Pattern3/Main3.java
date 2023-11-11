package Pattern3;

public class Main3 {
    public static void main(String[] args){
        Connected connected = new DataBaseConnected(new NoSQL());
        connected.connect();
    }
}
