package factory.factoryMethod.pizzaStore.pizzafactory;

import factory.factoryMethod.pizzaStore.pizza.NyCheesePizza;
import factory.factoryMethod.pizzaStore.pizza.Pizza;

public class NyPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")) return new NyCheesePizza();
        return null; // for the time being
    }
}
