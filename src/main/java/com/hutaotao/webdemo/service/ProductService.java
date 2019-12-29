package com.hutaotao.webdemo.service;

import com.hutaotao.webdemo.domain.Product;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author:ha
 * @time: 2019/12/29 17:11
 **/
public interface ProductService {
    public int getCount(Map<String, Object> param);

    public List<Product> getProductsByParam(Map<String, Object> param);

    public Product getByProductNo(String productNo);

    public boolean insertProduct(Product product);

    public boolean updateByNotNull(Product product);

    public boolean deleteByDomain (Product product);
}
