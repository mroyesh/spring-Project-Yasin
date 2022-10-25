package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {

    @Bean("Sony")
    public Monitor monitorSony(){
        return new SonyMonitor("123B","Sony", 27);
    }
    @Bean("Acer")
    public Monitor monitorAcer(){
        return new AcerMonitor("123B","Sony", 27);
    }
    @Bean
    public Motherboard asusMotherboard(){
        return new AsusMotherboard("12GDC", "Asus",123,12343,"Bios");
    }

    @Bean
    public Case dellCase(){
        return new DellCase("MO123", "Dell", "DC 120");
    }

}
