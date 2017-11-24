package com.example.demo.services;

import com.example.demo.mapper.UserMapper;
import com.example.demo.modal.User;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-25.
 */
@Service
public class UserServiceBean implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User findByid(Long id) {
        return userMapper.findById(id);

    }
}
