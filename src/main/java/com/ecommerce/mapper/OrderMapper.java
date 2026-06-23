package com.ecommerce.mapper;

import com.ecommerce.model.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    Order selectById(Integer id);
    List<Order> selectByUserId(@Param("userId") Integer userId);
    List<Order> selectAll();
    int insert(Order order);
    int update(Order order);
    int delete(Integer id);
}
