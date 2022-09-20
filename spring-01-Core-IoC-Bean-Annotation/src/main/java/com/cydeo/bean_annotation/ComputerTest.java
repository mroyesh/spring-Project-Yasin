package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        System.out.println("****************   Create Container   **********************");

        // creating container using Application Context
        ApplicationContext container= new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);


        System.out.println("Using BeansFactory for creating container");

        //Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();

        System.out.println("-----------------     retrieving beans  -----------------");

        //AcerMonitor acerMonitor=container.getBean(AcerMonitor.class);


        Monitor theMonitor= container.getBean(Monitor.class);
        Case theCase=container.getBean(Case.class);
        Motherboard theMotherboard=container.getBean(AsusMotherboard.class);

        PC myPc= new PC(theCase, theMonitor, theMotherboard);

        theCase.pressPowerButton();

        theMonitor.drawPixelAt();

        theMotherboard.loadProgram("Java");

        myPc.powerUp();

        System.out.println("************  Multiple Objects  ******************");

        Monitor theMonitor2 = container.getBean("monitorSony", Monitor.class);  //DEFAULT BEAN NAME
        Monitor theMonitor3 = container.getBean("sony", Monitor.class);  //CUSTOM BEAN NAME
        Monitor theMonitor4 = container.getBean( Monitor.class);  //@Primary



    }


}
