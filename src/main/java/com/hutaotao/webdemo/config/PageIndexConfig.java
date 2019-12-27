package com.hutaotao.webdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description: 设置项目默认访问路径
 * @author:
 * @time: 2019/12/27 18:32
 **/
@Configuration
public class PageIndexConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //默认地址
        registry.addViewController("/hello/").setViewName("index");
        //设置过滤优先级
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
