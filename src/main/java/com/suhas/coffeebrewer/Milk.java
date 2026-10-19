package com.suhas.coffeebrewer;

public class Milk extends BrewerComponent {
    public Milk(CoffeeBrewerMediator mediator) {
        super(mediator);
    }
    @Override
    public void add() {
        mediator.report("Adding milk to the brewer.");
    }
    @Override
    public void brew() {
        mediator.report("Mixing milk.");
    }
}