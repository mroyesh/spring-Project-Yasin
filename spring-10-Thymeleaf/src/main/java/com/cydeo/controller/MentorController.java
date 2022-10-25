package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/mentor/register
    public String register(Model model) {
        model.addAttribute("model", new Mentor());

        List<String> batchList = new ArrayList<>(Arrays.asList("JD1", "JD2", "JD3", "JD4"));
        model.addAttribute("batchList", batchList);


        return "mentor/register";


    }

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor) {

//        by @ModelAttribute we catch all attributes of mentor



//        return "mentor/mentor-confirmation";

        return "redirect: mentor/register";

    }


}
