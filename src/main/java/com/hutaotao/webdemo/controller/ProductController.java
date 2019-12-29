package com.hutaotao.webdemo.controller;

import com.hutaotao.webdemo.config.utis.MyJson;
import com.hutaotao.webdemo.domain.Product;
import com.hutaotao.webdemo.domain.User;
import com.hutaotao.webdemo.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author:ha
 * @time: 2019/12/29 21:31
 **/

@Controller
@RequestMapping("/product")
public class ProductController {
    Logger logger =  LoggerFactory.getLogger(getClass());

    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "/deleteByProductNo", method = RequestMethod.POST)
    public MyJson Login(@RequestBody Map<String,Object> map, HttpSession session){
        MyJson json = MyJson.defaultJson();
        logger.info("删除操作,map【{}】",map);
        Map<String, Object> param = new HashMap<>();
        try {
            if (map == null){
                throw new RuntimeException("所选数据为空");
            }
            String productNo = String.valueOf(map.get("productNo"));
            logger.info("删除操作,productNo【{}】",productNo);
            Product product = new Product();
            product.setProductNo(productNo);

            boolean flag = productService.deleteByDomain(product);
            if(!flag){
                throw new RuntimeException("未找到数据");
            }
            json.setMsg("删除成功");
        } catch (Exception e) {
            logger.error("未知异常",e);
            json.setFail(e.getMessage());
        }finally {
            return json;
        }
    }
}
