package com.example.demo.mapper;

import com.example.demo.modal.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by Administrator on 2017-11-25.
 */
@CacheConfig(cacheNames = "users")
@Component
@Mapper
public interface UserMapper {


    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);


    @Cacheable
    @Select("SELECT username,name ,email , address FROM USER WHERE id = #{id}")
    User findById(@Param("id") Long id);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    public int insert(@Param("name") String name, @Param("age") Integer age);

    @Cacheable(cacheNames = "findAll")
    @Select("select * from user")
    List<User> findAll();
}
