package com.example.demo.controller;

import com.example.demo.modal.User;
import com.sun.org.apache.xalan.internal.xsltc.dom.BitArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dl on 2017-12-12.
 */
@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private RedisTemplate redisTemplate;


    @GetMapping("/setString/{key}/{value}")
    public String setString(@PathVariable String key, @PathVariable String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value, 30);
        return value;
    }

    @GetMapping("/getString/{key}")
    public String getString(@PathVariable String key) {
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);
    }

    @GetMapping("/setUser/{key}/{value}")
    public String setUser(@PathVariable String key, @PathVariable String value) {
        User user = new User("username", "name");
        ValueOperations<String, User> valueops = redisTemplate.opsForValue();
        valueops.set(key, user);
        return "";
    }

    @GetMapping("/getUser/{key}")
    public User getUser(@PathVariable String key) {
        ValueOperations<String, User> valueops = redisTemplate.opsForValue();
        return valueops.get(key);
    }


}
