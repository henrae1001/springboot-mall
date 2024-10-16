package com.henrae1001.springbootmall.service;

import com.henrae1001.springbootmall.dto.ProductRequest;
import com.henrae1001.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
