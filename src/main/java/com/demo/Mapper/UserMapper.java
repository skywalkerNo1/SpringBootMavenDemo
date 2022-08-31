package com.demo.Mapper;

import com.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author admin
 * 2022/8/2714:32
 **/
public interface UserMapper {

    @Insert("INSERT INTO user(name, age) values (#{name}, #{age})")
    int insertUser(@Param("name") String name, @Param("age") Integer age);

    @Select("select * from user where id = #{id}")
    UserEntity selectByUserId(@Param("id") Integer id);
}
