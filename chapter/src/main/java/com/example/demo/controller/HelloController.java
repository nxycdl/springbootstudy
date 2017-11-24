package com.example.demo.controller;

import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-24.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @Value("${com.blog.name}")
    private String name;
    @Value("${com.blog.title}")
    private String title;
    @Value("${random.value}")
    private String random_String;


    @GetMapping(value = {"/", "/h", "/sayHello"})
    public String[] sayHello() {
        String[] sList = new String[10];
        sList[0] = helloService.sayHello("World");
        sList[1] = name;
        sList[2] = title;
        sList[3] = "随机字符串 ${random.value}" + random_String;
        sList[4] = "随机字符串 ${random.int ,long, int(10), int[10,20] }" + random_String;
        return sList;
    }

    @GetMapping(value = "/json")
    public String json() throws Exception {
        throw new Exception("发生了错误");
    }
}
