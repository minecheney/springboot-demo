package com.example.ssmshiro.mapper;

import com.example.ssmshiro.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAllUser();

    User findByUserName(String userName);
}
