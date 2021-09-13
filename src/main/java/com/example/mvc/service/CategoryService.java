package com.example.mvc.service;


import com.example.mvc.entity.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
