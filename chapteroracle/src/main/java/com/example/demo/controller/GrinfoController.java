package com.example.demo.controller;

import com.example.demo.modal.Grinfo;
import com.example.demo.services.GrinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017-11-25.
 */
@RestController
@RequestMapping("/grinfo")
public class GrinfoController {
    @Autowired
    private GrinfoService grinfoService;

    @GetMapping("/")
    public String serverStatus() {
        return "Oracle mybatis 和Mysql 的相同,只需要注意配置文件的驱动名称";
    }

    @GetMapping("/name/{name}")
    public List<Grinfo> getGrinfoByName(@PathVariable String name) {
        System.out.println(name);
        return grinfoService.getGrinfoByName(name);

    }

    @GetMapping("/route/{route}")
    public List<Grinfo> getGrinfoByRoute(@PathVariable String route) {
        return grinfoService.getGrinfoByRoute(route);
    }

}
