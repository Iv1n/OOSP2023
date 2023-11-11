package Pattern6;

public class Main6 {
    public static void main(String[] argr){
        CityObject house = new House();
        CityObject shop = new Shop();
        CityObject bar = new Bar();

        shop.draw();
        house.draw();
        bar.draw();
    }
}
