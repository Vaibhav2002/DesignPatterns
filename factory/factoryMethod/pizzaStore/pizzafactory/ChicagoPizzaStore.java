package factory.factoryMethod.pizzaStore.pizzafactory;

import factory.factoryMethod.pizzaStore.pizza.ChicagoCheesePizza;
import factory.factoryMethod.pizzaStore.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("Cheese")) return new ChicagoCheesePizza();
        return null;//for the time being
    }
}
