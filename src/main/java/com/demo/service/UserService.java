package com.demo.service;

import com.demo.Mapper.UserMapper;
import com.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * 2022/8/27 14:19
 **/
@RestController
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insert")
    public String insertService(String name, Integer age) {
        int update = jdbcTemplate.update("INSERT INTO user(name, age) values (?,?)", name, age);
        return update > 0 ? "success" : "fail";
    }

    @RequestMapping("/mybatisByUserId")
    public UserEntity mybatisByUser(Integer id) {
        return userMapper.selectByUserId(id);
    }

    @RequestMapping("/mybatisByInsert")
    public String mybatisByInsert(String name, Integer age) {
        userMapper.insertUser(name, age);
        return "success";
    }
}
