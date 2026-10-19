package com.suhas.coffeebrewer;

// 'Mediator' between brewer and components
public interface CoffeeBrewerMediator {
    // Adds ingredients to brewer
    void addingIngredient(Ingredient ingredient);
    // Brews coffee, milk optional
    void brewCoffee(boolean withMilk);
    // Components call this method to report status
    void report(String message);
}
