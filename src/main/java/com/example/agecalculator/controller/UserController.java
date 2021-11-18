package com.example.agecalculator.controller;

import com.example.agecalculator.entity.User;
import com.example.agecalculator.service.CalculateAge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    private CalculateAge calculateAge;

    @PostMapping("/user")
    public User create(@RequestBody User user){
        User input = new User();

        input.setName(user.getName());
        input.setSurname(user.getSurname());
        input.setCurrentAge(calculateAge.getAge(user.getDateOfBirth()));
        System.out.println("sending.......");
        return input;
    }

}
