package com.lg.provider.api.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.lg.api.entity.User;
import com.lg.api.service.UserService;
import com.lg.provider.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findOneById(Integer id) {

        return userMapper.getOne(Long.valueOf(id));
    }

}
