package com.example.ExposingRestAPI.controller;

import com.example.ExposingRestAPI.dto.ApiResponse;
import com.example.ExposingRestAPI.model.Company;
import com.example.ExposingRestAPI.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public ApiResponse<List<User>> getUsers() {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "Sagar", "sagar@gmail.com", "Admin", true, 100000, "9876543210",
                new Company("DIS", "IT", 5)));

        users.add(new User(2, "David", "david@gmail.com", "Manager", true, 200000, "9123456780",
                new Company("PEGA", "Development", 8)));

        users.add(new User(3, "Bunny", "bunny@gmail.com", "Developer", false, 90000, "9988776655",
                new Company("Wipro", "Management", 8)));

        users.add(new User(4, "Mahesh", "mahesh@gmail.com", "HR", true, 120000, "9012345678",
                new Company("Cognizant", "HR", 4)));

        users.add(new User(5, "Vikram", "vikram@gmail.com", "Developer", true, 70000, "9090909090",
                new Company("Tech Mahindra", "Engineering", 6)));

        return new ApiResponse<>("SUCCESS", "Users fetched successfully", 200, users);
    }

}
