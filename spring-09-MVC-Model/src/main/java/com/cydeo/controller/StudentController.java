package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("welcome")
    public String homePage(Model model){
//        String name= "Yasin";
//        method Model interface
        model.addAttribute("name", "Yasin");
        model.addAttribute("course", "JD");
        String subject= "Spring boot";
        model.addAttribute("Spring", subject);
        int studentId= new Random().nextInt();
        model.addAttribute("Id", studentId);

        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        model.addAttribute("numbers", numbers);

        LocalDate dt= LocalDate.now();
        model.addAttribute("date", dt);

        Student student= new Student(1,"Mike", "Smith");

        model.addAttribute("student", student);


        return "/student/welcome";


    }

}
