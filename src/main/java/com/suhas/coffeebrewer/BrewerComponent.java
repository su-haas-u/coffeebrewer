package com.suhas.coffeebrewer;

public abstract class BrewerComponent {
    protected final CoffeeBrewerMediator mediator;
    protected BrewerComponent(CoffeeBrewerMediator mediator) {
        this.mediator = mediator;
    }
    public abstract void add();
    public abstract void brew();
}
