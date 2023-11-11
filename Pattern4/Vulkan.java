package Pattern4;

public class Vulkan implements GraphicsAdapter{
    @Override
    public void initialize() {
        System.out.println("Vulkan initialize");
    }

    @Override
    public void render() {
        System.out.println("Vulkan render...");
    }
}
