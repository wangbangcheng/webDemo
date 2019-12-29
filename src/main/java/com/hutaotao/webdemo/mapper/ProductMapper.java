package com.hutaotao.webdemo.mapper;


import com.hutaotao.webdemo.domain.Product;
import com.hutaotao.webdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ProductMapper {

    public Integer getCount(Map<String, Object> param);

	public List<Product> getProductsByParam(Map<String, Object> param);

    public Product getByProductNo(String productNo);
    
    public boolean insertProduct(Product product);
    
    public boolean updateByNotNull(Product product);

    public boolean deleteByDomain (Product product);

}