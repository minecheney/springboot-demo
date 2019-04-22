package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAllUser();

    User findByUserName(String userName);
}
