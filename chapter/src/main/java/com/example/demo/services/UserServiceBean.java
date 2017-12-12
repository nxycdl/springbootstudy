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

    public void insert(User user) {
        userMapper.insertUser(user);
       /* Long id = userMapper.insertU(user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getAmount(),
                user.getBalance(),
                user.getPoint(),
                user.getMember_rank_id(),
                user.getRegister_ip(),
                user.getIs_enabled(),
                user.getIs_locked(),
                user.getLogin_failure_count(),
                user.getDelete_flag());*/
        System.out.println("插入后获取的id=" + user.getId());
    }

    public void delete(Long id) {
        userMapper.delUser(id);
    }

}
