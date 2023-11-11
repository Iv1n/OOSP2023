package Pattern1;

import Pattern1.italianFood.ItalianFood;
import Pattern1.italianFood.Pizza;
import Pattern1.asianFood.Ramen;
import Pattern1.asianFood.AsianFood;
import Pattern1.mexicanFood.MexicanFood;
import Pattern1.mexicanFood.Tacos;

public class Main1
{
    public static void main(String[] args){
        Dish asian = KitchenFactory.cook(AsianFood.Ramen);
        if (asian.getClass() == Ramen.class){
            System.out.println("Блюдо рамен готов");
        }
        Dish italian = KitchenFactory.cook(ItalianFood.Pizza);
        if (italian.getClass() == Pizza.class){
            System.out.println("Блюдо пицца готова");
        }
        Dish mexica = KitchenFactory.cook(MexicanFood.Tacos);
        if(mexica.getClass() == Tacos.class){
            System.out.println("Блюдо тако готово");
        }
    }
}
