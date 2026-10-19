package com.suhas.coffeebrewer;

public class Water extends BrewerComponent {
    public Water(CoffeeBrewerMediator mediator) {
        super(mediator);
    }
    @Override
    public void add() {
        mediator.report("Adding water to the brewer.");
    }
    @Override
    public void brew() {
        mediator.report("Heating water.");
    }
}