package com.cydeo.tightly_coupling;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class PC {

    private DellCase theCase;
    private AcerMonitor theMonitor;

    private AsusMotherboard theMotherboard;

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        theMonitor.drawPixelAt(1250, 100, "Green");
    }









}
