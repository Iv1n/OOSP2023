package Pattern1.asianFood;

import Pattern1.Dish;
import Pattern1.FoodEnum;

public enum AsianFood implements FoodEnum {
    Ramen(new Ramen()),
    Sushi(new Sushi()),
    Rice(new Rice())
    ;

    private final Dish dish;
    public Dish getDish() {
        return dish;
    }
    AsianFood(Dish dish){
        this.dish = dish;
    }
}
