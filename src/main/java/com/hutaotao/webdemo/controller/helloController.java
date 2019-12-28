package com.hutaotao.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 测试Controller用于调通项目
 * @author:
 * @time: 2019/12/27 14:53
 **/
@Controller
@RequestMapping("/hello")
public class helloController {

    @RequestMapping("/index")
    public String ToIndexPage(){
        return "main";
    }

}
