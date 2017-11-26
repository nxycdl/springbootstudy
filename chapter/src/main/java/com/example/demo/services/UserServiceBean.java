package com.example.demo.services;

import com.example.demo.mapper.UserMapper;
import com.example.demo.modal.User;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-11-25.
 */
@Service
public class UserServiceBean implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CacheManager cacheManager;

    @Override
    public List<User> findAll() {
        System.out.println(cacheManager.getCacheNames());
        System.out.println(cacheManager.getCache("users"));
        System.out.println(cacheManager.getCache("users"));
        return userMapper.findAll();
    }

    public User findByid(Long id) {
        return userMapper.findById(id);
    }

}
