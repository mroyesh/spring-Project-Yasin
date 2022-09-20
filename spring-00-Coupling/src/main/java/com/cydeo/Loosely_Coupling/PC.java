package com.cydeo.Loosely_Coupling;

import com.cydeo.Loosely_Coupling.caseFactory.Case;
import com.cydeo.Loosely_Coupling.monitorFactory.Monitor;
import com.cydeo.Loosely_Coupling.motherboardFactory.Motherboard;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){

        theMonitor.drawPixelAt();
    }
}
