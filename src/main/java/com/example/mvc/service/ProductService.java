package com.example.mvc.service;


import com.example.mvc.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void save(Product product);
    void edit(long id, Product newProduct);
    void delete(long id);
    Optional<Product> findById(long id);
    List<Product> findAllByCategoryId(long categoryId);
}