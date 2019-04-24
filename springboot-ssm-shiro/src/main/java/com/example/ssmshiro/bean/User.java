package com.example.ssmshiro.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private String userName;
    private String password;
    private String address;
    private String status;
}
