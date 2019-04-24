package com.example.ssmshiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ssmshiro.mapper")
public class SpringbootSsmShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmShiroApplication.class, args);
    }

}
