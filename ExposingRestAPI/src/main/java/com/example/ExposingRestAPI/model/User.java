package com.example.ExposingRestAPI.model;

import lombok.Data;

@Data
public class User {

    private int id;
    private String name;
    private String email;
    private String role;
    private boolean active;
    private double salary;
    private String phone;
    private Company company;

    public User(int id, String name, String email, String role,
                boolean active, double salary, String phone, Company company) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.active = active;
        this.salary = salary;
        this.phone = phone;
        this.company = company;
    }
}
