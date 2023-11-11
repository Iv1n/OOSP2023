package Pattern4;

public class Main4 {
    public static void main(String [] args){
        GraphicsManager graphicsManager = new GraphicsManager(new DirectX());
        graphicsManager.intialize();
        graphicsManager.render();
    }
}
