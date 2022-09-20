package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("welcome")
    public String empTest(Model model){
        model.addAttribute("name", "Yasin");
        model.addAttribute("position", "Senior developer");
        model.addAttribute("company", "Adobe");
        model.addAttribute("salary", "180000");
        return "employee/welcome";

    }
}
