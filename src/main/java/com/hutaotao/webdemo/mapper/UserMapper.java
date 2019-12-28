package com.hutaotao.webdemo.mapper;


import com.hutaotao.webdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;
@Mapper
@Repository
public interface UserMapper {

    public User login(Map<String,Object> param);

	public User selectUserByParam(Map<String,Object> param);

    public User selectByPrimaryKey(Integer Id);
    
    public boolean insertUser(User user);
    
    public boolean updateByNotNull(User user);
    
    public ArrayList<User> selectAll();

}