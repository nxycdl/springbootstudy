package com.example.demo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-11-24.
 */
@Service
public class HelloServiceBean implements HelloService {
    @Override
    public String sayHello(String s) {
        return "sayHello:" + s;
    }
}
