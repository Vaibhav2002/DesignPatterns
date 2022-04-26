package factory.factoryMethod.pizzaStore.pizzafactory;

import factory.factoryMethod.pizzaStore.pizza.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.preparePizza();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
