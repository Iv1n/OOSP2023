package Pattern1.mexicanFood;

import Pattern1.Dish;
import Pattern1.FoodEnum;

public enum MexicanFood implements FoodEnum {
    Burritos (new Burritos()),
    Tacos (new Tacos())
    ;

    public final Dish dish;
    public Dish getDish() {
        return dish;
    }
    MexicanFood (Dish dish){
        this.dish = dish;
    }
}
