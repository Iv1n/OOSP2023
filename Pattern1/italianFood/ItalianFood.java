package Pattern1.italianFood;

import Pattern1.Dish;
import Pattern1.FoodEnum;

public enum ItalianFood implements FoodEnum {
    Pizza(new Pizza()),
    Pasta (new Pasta())
    ;

    private final Dish dish;
    public Dish getDish() {
        return dish;
    }
    ItalianFood (Dish dish){
        this.dish = dish;
    }
}
