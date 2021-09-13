package com.example.mvc.service;


import com.example.mvc.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
