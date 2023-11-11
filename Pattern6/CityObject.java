package Pattern6;

abstract class CityObject {
    public final void draw(){
        drawBase();
        drawSpecific();
    }
    private void drawBase(){
        System.out.println("Drawing base for " + getClass().getSimpleName());
    }
    protected abstract void drawSpecific();
}
