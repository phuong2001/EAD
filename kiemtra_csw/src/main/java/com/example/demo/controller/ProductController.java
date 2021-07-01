package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.model.BaseResponse;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity getProduct(){
        BaseResponse res = new BaseResponse();
        res.data = productService.getAllProducts();
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody ProductEntity p){
        ProductEntity data = productService.addProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody ProductEntity p){
        ProductEntity data = productService.sellProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }
}
