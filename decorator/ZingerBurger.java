package decorator;

public class ZingerBurger extends Burger{

    ZingerBurger(){
        name = "Zinger Burger";
    }

    @Override
    int price() {
        return 100;
    }

    @Override
    int calories() {
        return 40;
    }

    static class Builder extends Burger.Builder{

        Builder() {
            super(new ZingerBurger());
        }
    }
}
