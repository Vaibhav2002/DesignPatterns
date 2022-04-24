package decorator.burgerRestaurant.burgers;

public class ZingerBurger extends Burger{

    ZingerBurger(){
        name = "Zinger Burger";
    }

    @Override
    public int price() {
        return 100;
    }

    @Override
    public int calories() {
        return 40;
    }

    public static class Builder extends Burger.Builder{

        public Builder() {
            super(new ZingerBurger());
        }
    }
}
