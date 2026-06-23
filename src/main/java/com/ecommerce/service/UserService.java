package com.ecommerce.service;

import com.ecommerce.model.User;
import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    User getUserByUsername(String username);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
}
