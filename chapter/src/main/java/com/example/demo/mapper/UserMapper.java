package com.example.demo.mapper;

import com.example.demo.modal.User;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;


/**
 * Created by Administrator on 2017-11-25.
 * CacheConfig 缓存的默认names；
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

    @CacheEvict(value = {"users"}, allEntries=true)
    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insert(@Param("name") String name, @Param("age") Integer age);

    @Cacheable
    @Select("select * from user")
    List<User> findAll();

    @CacheEvict(value = {"users"}, allEntries=true)
    @Insert("INSERT INTO USER(username, password, email, amount, balance, point, member_rank_id, register_ip, is_enabled, is_locked, login_failure_count, delete_flag) VALUES(#{username}, #{password}, #{email}, #{amount}, #{balance}, #{point}, #{member_rank_id}, #{register_ip}, #{is_enabled}, #{is_locked}, #{login_failure_count}, #{delete_flag})")
    public int insertU(@Param("username") String username, @Param("password") String password, @Param("email") String email, @Param("amount") BigDecimal amount, @Param("balance") BigDecimal balance, @Param("point") Integer point, @Param("member_rank_id") Integer member_rank_id, @Param("register_ip") String register_ip, @Param("is_enabled") Integer is_enabled, @Param("is_locked") Integer is_locked, @Param("login_failure_count") Integer login_failure_count, @Param("delete_flag") Integer delete_flag);


    @CacheEvict(value = {"users"}, allEntries=true)
    @Insert("INSERT INTO USER(username, password, email, amount, balance, point, member_rank_id, register_ip, is_enabled, is_locked, login_failure_count, delete_flag) VALUES(#{username}, #{password}, #{email}, #{amount}, #{balance}, #{point}, #{member_rank_id}, #{register_ip}, #{is_enabled}, #{is_locked}, #{login_failure_count}, #{delete_flag})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertUser(User user);

    @CacheEvict(value = {"users"}, allEntries=true)
    @Delete("delete from user where id = #{id}")
    public int delUser(@Param("id") Long id) ;
}
