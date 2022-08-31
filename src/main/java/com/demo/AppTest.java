package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 * 2022/8/27 13:58
 **/
@MapperScan
@SpringBootApplication
public class AppTest {

    public static void main(String[] args) {
        SpringApplication.run(AppTest.class);
    }
}
