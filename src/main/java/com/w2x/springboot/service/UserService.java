package com.w2x.springboot.service;

import com.w2x.springboot.entity.User;
import com.w2x.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        int i = userMapper.insertSelective(user);
        System.out.println(i);
    }

    public User findOne(String name) {
        User user = userMapper.selectByPrimaryKey(name);
        return user;
    }
}
