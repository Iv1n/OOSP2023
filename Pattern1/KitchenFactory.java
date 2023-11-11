package Pattern1;

public class KitchenFactory {
    public static Dish cook(FoodEnum foodEnum){
        return foodEnum.getDish();
    }
}
