package com.example.ssmshiro.controller;

import com.example.ssmshiro.bean.User;
import com.example.ssmshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> findAll(){
        return userService.findAllUser();
    }
}
