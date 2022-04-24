package decorator;

public class Mayonnaise extends AddOns {

    Burger burger;
    Mayonnaise(Burger burger){
        this.burger = burger;
    }

    @Override
    String getDescription() {
        return "Mayonnaise, "+burger.getDescription();
    }

    @Override
    int price() {
        return 20 + burger.price();
    }

    @Override
    int calories() {
        return 6;
    }
}
