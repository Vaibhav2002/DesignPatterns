package factory.factoryMethod.pizzaStore.pizza;

public class ChicagoCheesePizza extends Pizza{

    public ChicagoCheesePizza(){
        name = "Chicago Cheese Pizza";
        dough = "Thick Dough";
        sauce = "Barbeque Sauce";
    }

    @Override
    public void cut() {
        System.out.println("Cut in squares");
    }
}
