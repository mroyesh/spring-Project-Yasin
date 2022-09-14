package com.cydeo.tightly_coupling;

public class Main {
    public static void main(String[] args) {


        AcerMonitor theMonitor = new AcerMonitor("24 inch Beast", "Acer", 24);

        AsusMotherboard asusMotherboard= new AsusMotherboard("AC123", "Asus", 4,6,"B2.44");

        DellCase theCase= new DellCase("BH12", "Dell", "240");

        PC myPc= new PC(theCase,theMonitor, asusMotherboard );
        myPc.powerUp();




    }
}
