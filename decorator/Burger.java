package decorator;


public abstract class Burger {
    String name = "Unknown burger";

    String getDescription() {
        return name;
    }

    abstract int price();

    abstract int calories();

    static class Builder{
        Burger burger;
        Builder(Burger burger){
            this.burger = burger;
        }

        Builder addCheese(){
            burger = new Cheese(burger);
             return this;
        }

        Builder addMayonnaise(){
            burger = new Mayonnaise(burger);
            return this;
        }

        Burger build(){
            return burger;
        }
    }

}
