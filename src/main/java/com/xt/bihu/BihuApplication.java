package com.xt.bihu;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.xt.bihu.mapper"})
public class BihuApplication {

    public static void main(String[] args) {
        SpringApplication.run(BihuApplication.class, args);
    }

}
