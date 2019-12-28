package com.hutaotao.webdemo.controller;


import com.alibaba.fastjson.JSON;
import com.hutaotao.webdemo.config.utis.MyJson;
import com.hutaotao.webdemo.domain.User;
import com.hutaotao.webdemo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author:
 * @time: 2019/12/27 19:26
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    Logger logger =  LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public MyJson Login(@RequestBody Map<String,Object> map){
        MyJson json = MyJson.defaultJson();
        Map<String, Object> param = new HashMap<>();
        try {
            if (map!=null || map.get("variableName") == null || map.get("password") ==null){
                throw new RuntimeException("必填项未输！");
            }
            String variableName = String.valueOf(map.get("variableName"));
            String password = String.valueOf(map.get("password"));
            logger.info("登录操作,variableName【{}】",variableName);

            param.put("variableName",variableName);
            param.put("password",password);
            User user = userService.login(param);
            if(user == null){
                throw new RuntimeException("密码错误或无该用户!");
            }
            logger.info("登录信息正确【{}】",user.toString());
            String msg = "，登录成功";
            json.setMsg(StringUtils.isEmpty(user.getUserName())?(user.getCellphone()+msg):(user.getUserName()+msg));
        } catch (Exception e) {
            json.setFail(e.getMessage());
        }finally {
            return json;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public MyJson register(@RequestBody Map<String,Object> map){
        MyJson json = MyJson.defaultJson();
        Map<String, Object> param = new HashMap<>();
        try {
            if (map!=null){
                throw new RuntimeException("必填项未输！");
            }
            String userName = String.valueOf(map.get("userName"));
            String email = String.valueOf(map.get("email"));
            String password = String.valueOf(map.get("password"));
            String cellphone = String.valueOf(map.get("cellphone"));
            if (userName == null || email == null || password == null || cellphone == null){
                throw new RuntimeException("必填项未输！");
            }
            logger.info("注册操作,userName【{}】",userName);
            User user = new User();
            user.setAdminFlag(false);
            user.setCellphone(cellphone);
            user.setPassword(password);
            user.setEmail(email);
            user.setUserName(userName);
            boolean insertFlag = userService.insertUser(user);
            if(!insertFlag){
                throw new RuntimeException("注册失败");
            }
            json.setMsg("注册成功");
        } catch (Exception e) {
            json.setFail(e.getMessage());
        }finally {
            return json;
        }
    }
}
