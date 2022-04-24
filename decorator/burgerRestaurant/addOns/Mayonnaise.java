package decorator.burgerRestaurant.addOns;

import decorator.burgerRestaurant.burgers.Burger;

public class Mayonnaise extends AddOns {

    Burger burger;
    public Mayonnaise(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return "Mayonnaise, "+burger.getDescription();
    }

    @Override
    public int price() {
        return 20 + burger.price();
    }

    @Override
    public int calories() {
        return 6;
    }
}
