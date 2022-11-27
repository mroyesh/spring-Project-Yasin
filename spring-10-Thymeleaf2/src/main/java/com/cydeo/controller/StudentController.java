package com.cydeo.controller;


import com.cydeo.bootstrap.DataGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";

    }
    @GetMapping("welcome")
    public String welcome(){

        return "student/welcome";
    }
}
