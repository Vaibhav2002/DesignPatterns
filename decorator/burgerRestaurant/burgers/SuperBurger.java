package decorator.burgerRestaurant.burgers;

public class SuperBurger extends Burger{

    SuperBurger(){
        name = "Super Burger";
    }

    @Override
    public int price() {
        return 200;
    }

    @Override
    public int calories() {
        return 120;
    }

    public static class Builder extends Burger.Builder{

        public Builder() {
            super(new SuperBurger());
        }
    }
}
