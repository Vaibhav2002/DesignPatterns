package decorator.burgerRestaurant.burgers;


import decorator.burgerRestaurant.addOns.Cheese;
import decorator.burgerRestaurant.addOns.Mayonnaise;

public abstract class Burger {
    String name = "Unknown burger";

    public String getDescription() {
        return name;
    }

    public abstract int price();

    public abstract int calories();

    public static class Builder{
        Burger burger;
        Builder(Burger burger){
            this.burger = burger;
        }

        public Builder addCheese(){
            burger = new Cheese(burger);
             return this;
        }

        public Builder addMayonnaise(){
            burger = new Mayonnaise(burger);
            return this;
        }

        public Burger build(){
            return burger;
        }
    }

}
