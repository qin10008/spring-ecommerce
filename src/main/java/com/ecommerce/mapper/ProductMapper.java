package com.ecommerce.mapper;

import com.ecommerce.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    Product selectById(Integer id);
    List<Product> selectAll();
    List<Product> selectByCategory(@Param("category") String category);
    int insert(Product product);
    int update(Product product);
    int delete(Integer id);
}
