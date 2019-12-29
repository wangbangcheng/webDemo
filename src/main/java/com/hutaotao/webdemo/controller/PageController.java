package com.hutaotao.webdemo.controller;

import com.hutaotao.webdemo.domain.Product;
import com.hutaotao.webdemo.domain.User;
import com.hutaotao.webdemo.service.ProductService;
import com.hutaotao.webdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:ha
 * @time: 2019/12/29 14:20
 **/
@Controller
@RequestMapping("/page")
public class PageController {
    Logger logger =  LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/toHome")
    public String toHome(HttpSession session, HttpServletRequest request){
        User user = (User) session.getAttribute("user");
        if (user == null){
            logger.info("会话中的用户为空，返回登录页面");
            return "main";
        }
        logger.info("会话中的用户{}",user.getUserName());
        //查询所有的商品数量
        Map<String, Object> param = new HashMap<>();
        int productCount = productService.getCount(param);
        List<Product> products = productService.getProductsByParam(param);


        request.setAttribute("productCount",productCount);
        request.setAttribute("products",products);

        return "main";
    }
}
