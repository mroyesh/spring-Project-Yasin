package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)// those fields are not known by class will be ignored
//@JsonIgnoreProperties(value = "country", "address")// any field we want to ignore inside method
public class AccountDTO {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;


//    @JsonIgnore // in this case we completely ignore the field we annotate
    @JsonBackReference//this field is not going to be serialized, but it is not ignored
    private UserDTO user;

}
