package factory.factoryMethod.pizzaStore.pizza;

public abstract class Pizza {
    String name, dough, sauce;

    public void preparePizza() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + "...");
        System.out.println("Adding " + sauce + "...");
    }

    public void bake() {
        System.out.println("Baking");
    }

    public void cut() {
        System.out.println("Cutting");
    }
}
