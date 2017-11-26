package com.example.demo.services;

import com.example.demo.modal.User;

import java.util.List;

/**
 * Created by Administrator on 2017-11-25.
 */
public interface UserService {
    public User findByid(Long id) ;

    public List<User> findAll();
}
