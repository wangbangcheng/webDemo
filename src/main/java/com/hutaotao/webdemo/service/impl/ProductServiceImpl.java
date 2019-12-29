package com.hutaotao.webdemo.service.impl;

import com.hutaotao.webdemo.domain.Product;
import com.hutaotao.webdemo.mapper.ProductMapper;
import com.hutaotao.webdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:ha
 * @time: 2019/12/29 17:13
 **/
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public int getCount(Map<String, Object> param) {
        return productMapper.getCount(param);
    }

    @Override
    public List<Product> getProductsByParam(Map<String, Object> param) {
        if(param.get("pageStart") == null){
            int pageStart = 0;
            param.put("pageStart",pageStart);
        }
        return productMapper.getProductsByParam(param);
    }

    @Override
    public Product getByProductNo(String productNo) {
        return productMapper.getByProductNo(productNo);
    }

    @Override
    public boolean insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    @Override
    public boolean updateByNotNull(Product product) {
        return productMapper.updateByNotNull(product);
    }

    @Override
    public boolean deleteByDomain(Product product) {
        return productMapper.deleteByDomain(product);
    }


}
