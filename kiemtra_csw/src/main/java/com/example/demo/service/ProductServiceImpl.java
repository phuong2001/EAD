package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public ProductEntity addProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public ProductEntity sellProduct(ProductEntity p) {
        return productRepo.save(p);
    }
}
