package com.cydeo.model;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Mentor {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

}
