package com.lg.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lg.api.entity.User;
import com.lg.provider.mapper.UserMapper;

@RestController
public class HelloWorldController {
	
	@Autowired
	private UserMapper userMapper;
	
    @RequestMapping("/hello")
    public String index() {
//        return "Hello World";
    	User user = userMapper.getOne(3l);
    	return user.getUserName()+"====="+user.getPassWord();
    }
}