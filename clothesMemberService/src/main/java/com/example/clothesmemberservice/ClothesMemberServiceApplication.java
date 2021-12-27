package com.example.clothesmemberservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.clothesmemberservice.dao")
public class ClothesMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClothesMemberServiceApplication.class, args);
    }

}
