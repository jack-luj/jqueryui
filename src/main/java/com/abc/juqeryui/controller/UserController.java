package com.abc.juqeryui.controller;

import com.abc.juqeryui.entity.User;
import com.abc.juqeryui.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by jackl on 2016/4/27.
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello:"+new Date().getTime();
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> userList=userMapper.findAll();
        return userList;
    }
}
