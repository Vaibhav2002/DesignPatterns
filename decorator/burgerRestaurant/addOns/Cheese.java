package decorator.burgerRestaurant.addOns;

import decorator.burgerRestaurant.burgers.Burger;

public class Cheese extends AddOns{

    Burger burger;
    public Cheese(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return "Cheese, "+burger.getDescription();
    }

    @Override
    public int price() {
        return 10 + burger.price();
    }

    @Override
    public int calories() {
        return 3;
    }
}
