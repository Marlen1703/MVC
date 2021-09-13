package com.example.mvc.service.imp;

import com.example.mvc.entity.Product;
import com.example.mvc.repository.ProductRepository;
import com.example.mvc.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void edit(long id, Product newProduct) {
        Optional<Product> found= productRepository.findById(id);
        Product product = found.get();
        product.setImageUrl(newProduct.getImageUrl());
        product.setImageUrl(newProduct.getImageUrl());
        product.setPrice(newProduct.getPrice());
        save(newProduct);
    }

    @Override
    public void delete(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(long id) {
         return productRepository.findById(id);
    }

    @Override
    public List<Product> findAllByCategoryId(long categoryId) {
        return productRepository.findAllByCategoryId(categoryId);    }
}
