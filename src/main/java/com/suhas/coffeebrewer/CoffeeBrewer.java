package com.suhas.coffeebrewer;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Consumer;

public class CoffeeBrewer implements CoffeeBrewerMediator {
    private final Map<Ingredient, BrewerComponent> components = new EnumMap<>(Ingredient.class);
    private final Consumer<String> output;

    public CoffeeBrewer() {
        this(System.out::println);
    }

    public CoffeeBrewer(Consumer<String> output) {
        this.output = output;
        components.put(Ingredient.COFFEE, new Coffee(this));
        components.put(Ingredient.WATER, new Water(this));
        components.put(Ingredient.MILK, new Milk(this));
    }

    @Override
    public void addingIngredient(Ingredient ingredient) {
        components.get(ingredient).add();
    }

    @Override
    public void brewCoffee(boolean withMilk) {
        report("Hi! Starting your brew.");
        components.get(Ingredient.COFFEE).brew();
        components.get(Ingredient.WATER).brew();
        if(withMilk) {
            components.get(Ingredient.MILK).brew();
        } else {
            report("One black coffee coming up.");
        }
        report("Your coffee is ready!");
    }

    @Override
    public void report(String message) {
        output.accept(message);
    }

}
