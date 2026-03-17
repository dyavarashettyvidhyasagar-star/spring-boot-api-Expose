package com.example.ExposingRestAPI.model;

import lombok.Data;

@Data
public class Company {

    private String name;

    private String department;

    private int experience;

    public Company(String name, String department, int experience) {
        this.name = name;
        this.department = department;
        this.experience = experience;
    }
}
