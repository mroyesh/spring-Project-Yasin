package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("welcome")
    public String homePage(Model model){
//        String name= "Yasin";
//        method Model interface
        model.addAttribute("name", "Unknown");
        model.addAttribute("course", "Love You!");

        return "/student/welcome";


    }

}
