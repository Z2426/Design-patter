package com.example.design_patter.Iterator;

import lombok.Data;

@Data
public class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructors, getters, setters
}



