package com.example.ssmshiro.service.impl;

import com.example.ssmshiro.bean.User;
import com.example.ssmshiro.mapper.UserMapper;
import com.example.ssmshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userDAO;

    @Override
    public List<User> findAllUser() {
        return userDAO.findAllUser();
    }
}
