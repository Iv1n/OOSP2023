package Pattern4;

public class DirectX implements GraphicsAdapter{
    @Override
    public void initialize() {
        System.out.println("DirectX initialize");
    }

    @Override
    public void render() {
        System.out.println("DirectX render...");
    }
}
