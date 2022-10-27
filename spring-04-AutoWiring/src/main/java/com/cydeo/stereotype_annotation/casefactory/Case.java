package com.cydeo.stereotype_annotation.casefactory;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
//  private Dimensions dimensions;


    @Autowired
    private Dimensions dimensions;  // this is field injection
//    we have constructor injection and setter injection
//    in this case we don't need to add on fields and constructor

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;



    }


//    @Autowired  // in this case we injected object on the constructor
//    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
//        this.model = model;
//        this.manufacturer = manufacturer;
//        this.powerSupply = powerSupply;
//        this.dimensions= dimensions;
//    }



    public abstract void pressPowerButton();

}
