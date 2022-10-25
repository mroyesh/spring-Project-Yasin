package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String email;

    private String surName;
    private String username;

    @OneToMany(mappedBy = "customer") //in OneToMany relationship, ownership belongs to many side
    private List<Customer> customerList;

    public Customer(String name, String address, String email, String surName, String username) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.surName = surName;
        this.username = username;
    }
}
