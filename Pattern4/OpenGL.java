package Pattern4;

public class OpenGL implements GraphicsAdapter{
    @Override
    public void initialize() {
        System.out.println("OpenGL initialize");
    }

    @Override
    public void render() {
        System.out.println("OpenGL render...");
    }
}
