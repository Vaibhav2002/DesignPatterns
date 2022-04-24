package decorator;

public class Cheese extends AddOns{

    Burger burger;
    Cheese(Burger burger){
        this.burger = burger;
    }

    @Override
    String getDescription() {
        return "Cheese, "+burger.getDescription();
    }

    @Override
    int price() {
        return 10 + burger.price();
    }

    @Override
    int calories() {
        return 3;
    }
}
