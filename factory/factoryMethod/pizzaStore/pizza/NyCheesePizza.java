package factory.factoryMethod.pizzaStore.pizza;

public class NyCheesePizza extends Pizza{
    public NyCheesePizza(){
        name = "Ny Style Cheese Pizza";
        dough = "Thin crust";
        sauce = "Teriyaki Sauce";
    }

    @Override
    public void cut() {
        System.out.println("Cut in large triangles");
    }
}
