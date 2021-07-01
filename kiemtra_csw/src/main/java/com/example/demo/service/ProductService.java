package com.example.demo.service;

import com.example.demo.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity addProduct(ProductEntity p);
    ProductEntity sellProduct(ProductEntity p);
}
