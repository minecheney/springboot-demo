package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserDAO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> findAllUser() {
        return userDAO.findAllUser();
    }
}
