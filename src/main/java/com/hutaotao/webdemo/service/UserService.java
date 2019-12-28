package com.hutaotao.webdemo.service;

import com.hutaotao.webdemo.domain.User;


import java.util.ArrayList;
import java.util.Map;

/**
 * @description:
 * @author:
 * @time: 2019/12/28 11:38
 **/
public interface UserService {

    public User login(Map<String,Object> param);

    public User selectUserByParam(Map<String,Object> param);

    public User selectByPrimaryKey(Integer Id);

    public boolean insertUser(User user);

    public boolean updateByNotNull(User user);

    public ArrayList<User> selectAll();

}
