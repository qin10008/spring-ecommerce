package com.ecommerce.mapper;

import com.ecommerce.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User selectById(Integer id);
    User selectByUsername(@Param("username") String username);
    User selectByEmail(@Param("email") String email);
    List<User> selectAll();
    int insert(User user);
    int update(User user);
    int delete(Integer id);
}
