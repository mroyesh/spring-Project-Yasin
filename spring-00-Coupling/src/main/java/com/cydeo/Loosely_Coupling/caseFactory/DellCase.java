package com.cydeo.Loosely_Coupling.caseFactory;

public class DellCase extends Case{

    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

    @Override
    public void pressPowerButton() {

        System.out.println("Power Button Pressed");

    }
}
