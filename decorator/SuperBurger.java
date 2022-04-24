package decorator;

public class SuperBurger extends Burger{

    SuperBurger(){
        name = "Super Burger";
    }

    @Override
    int price() {
        return 200;
    }

    @Override
    int calories() {
        return 120;
    }

    static class Builder extends Burger.Builder{

        Builder() {
            super(new SuperBurger());
        }
    }
}
