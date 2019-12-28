package com.hutaotao.webdemo.service.impl;

import com.hutaotao.webdemo.mapper.UserMapper;
import com.hutaotao.webdemo.domain.User;
import com.hutaotao.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

/**
 * @description:
 * @author:
 * @time: 2019/12/28 11:45
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(Map<String, Object> param) {
        return userMapper.login(param);
    }

    @Override
    public User selectUserByParam(Map<String, Object> param) {
        return userMapper.selectUserByParam(param);
    }

    @Override
    public User selectByPrimaryKey(Integer Id) {
        return userMapper.selectByPrimaryKey(Id);
    }


    @Override
    public boolean insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public boolean updateByNotNull(User user) {
        return userMapper.updateByNotNull(user);
    }

    @Override
    public ArrayList<User> selectAll() {
        return userMapper.selectAll();
    }
}
