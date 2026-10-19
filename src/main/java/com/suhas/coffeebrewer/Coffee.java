package com.suhas.coffeebrewer;

public class Coffee extends BrewerComponent {
    public Coffee(CoffeeBrewerMediator mediator) {
        super(mediator);
    }
    @Override
    public void add() {
        mediator.report("Adding coffee to the brewer.");
    }
    @Override
    public void brew() {
        mediator.report("Brewing...");
    }
}