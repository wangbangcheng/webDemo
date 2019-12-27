package com.hutaotao.webdemo.dao;


import com.hutaotao.webdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface UserMapper {
    
	public User selectByPrimaryKey(User user);
	
	public User selectUserByPhone(User user);
    
    public boolean insertUser(User user);
    
    public boolean updateUser(User user);
    
    public ArrayList<User> selectAll();
    
    public void update(User user);
}