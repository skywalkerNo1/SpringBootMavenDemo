package com.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author admin
 * 2022/8/27 14:20
 **/
@Data
public class UserEntity {

    private Integer id;

    private String name;

    private Integer age;

    private Date ctime;

    private Date utime;

    public UserEntity() {
    }

    public UserEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.ctime = new Date();
    }

}
