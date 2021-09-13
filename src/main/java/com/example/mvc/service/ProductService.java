package com.example.mvc.service;


import com.example.mvc.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    void save(Product product);
    void edit(long id, Product newProduct);
    void delete(long id);
    Product findById(long id);
    List<Product> findAllByCategoryId(long categoryId);
}