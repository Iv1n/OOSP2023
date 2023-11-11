package Pattern4;

public class GraphicsManager {
    private final GraphicsAdapter graphicsAdapter;

    public GraphicsManager(GraphicsAdapter graphicsAdapter){
        this.graphicsAdapter = graphicsAdapter;
    }
    public void intialize(){
        graphicsAdapter.initialize();
    }
    public void render(){
        graphicsAdapter.render();
    }
}
