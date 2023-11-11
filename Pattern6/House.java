package Pattern6;

public class House extends CityObject{
    @Override
    protected void drawSpecific() {
        System.out.println("Drawing walls and roof for the house");
    }
}
