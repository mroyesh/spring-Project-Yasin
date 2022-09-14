package com.cydeo.Loosely_Coupling;

import com.cydeo.Loosely_Coupling.caseFactory.Case;
import com.cydeo.Loosely_Coupling.caseFactory.DellCase;
import com.cydeo.Loosely_Coupling.monitorFactory.AcerMonitor;
import com.cydeo.Loosely_Coupling.monitorFactory.Monitor;
import com.cydeo.Loosely_Coupling.motherboardFactory.AsusMotherboard;
import com.cydeo.Loosely_Coupling.motherboardFactory.Motherboard;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new AcerMonitor("29 inch wide", "Sony", 29);
        Case case1 = new DellCase("BS12", "Dell", "AC120");
        Motherboard motherboard1= new AsusMotherboard("SHP70", "Asus", 4,6, "A1.2");

        PC myPc= new PC(case1,monitor1,  motherboard1);

        myPc.powerUp();


    }
}
