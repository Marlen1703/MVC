package com.example.mvc.repository;

import com.example.mvc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository  <Product, Long> {

    Optional<Product> findById(long id);
    Product findByName(String name);
    List<Product> findAllByCategoryId(long categoryId);
}
