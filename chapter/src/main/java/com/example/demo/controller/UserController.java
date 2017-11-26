package com.example.demo.controller;

import com.example.demo.modal.User;
import com.example.demo.services.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-11-25.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户列表", notes = "notes")
    @GetMapping("/")
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        list.add(new User("username", "name"));
        list.add(new User("username1", "name1"));
        list.add(new User("username2", "name2"));
        list = userService.findAll();
        return list;
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping("/")
    public Integer postUser(User user) {
        System.out.println("postUser");
        return 1;
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable Long id) {
        User user = userService.findByid(id);
        System.out.println(user);
        return user;

    }
}
