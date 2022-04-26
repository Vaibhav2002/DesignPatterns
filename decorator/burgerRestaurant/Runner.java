package decorator.burgerRestaurant;

import decorator.burgerRestaurant.burgers.Burger;
import decorator.burgerRestaurant.burgers.SuperBurger;
import decorator.burgerRestaurant.burgers.ZingerBurger;

public class Runner {
    public static void main(String[] args) {
        Burger zinger = new ZingerBurger.Builder()
                .addCheese()
                .build();
        Burger superBurger = new SuperBurger.Builder()
                .addCheese()
                .addMayonnaise()
                .build();
        System.out.println(zinger.getDescription() + " " + zinger.price());
        System.out.println(superBurger.getDescription() + " " + superBurger.price());
    }
}
