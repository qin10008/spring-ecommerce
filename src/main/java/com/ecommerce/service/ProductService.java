package com.ecommerce.service;

import com.ecommerce.model.Product;
import java.util.List;

public interface ProductService {
    Product getProductById(Integer id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Integer id);
}
