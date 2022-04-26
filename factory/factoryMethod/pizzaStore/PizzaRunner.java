package factory.factoryMethod.pizzaStore;

import factory.factoryMethod.pizzaStore.pizzafactory.ChicagoPizzaStore;
import factory.factoryMethod.pizzaStore.pizzafactory.NyPizzaStore;
import factory.factoryMethod.pizzaStore.pizzafactory.PizzaStore;

public class PizzaRunner {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        nyStore.orderPizza("Cheese");
        chicagoStore.orderPizza("Cheese");
    }
}
