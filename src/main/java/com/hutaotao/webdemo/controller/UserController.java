package com.hutaotao.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author:
 * @time: 2019/12/27 19:26
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/login")
    public String Login(){
        System.out.println("nihao");
        return "Ohhhhhhhhhhhhhhh";
    }
}
