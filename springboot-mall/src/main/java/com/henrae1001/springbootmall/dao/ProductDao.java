package com.henrae1001.springbootmall.dao;

import com.henrae1001.springbootmall.constant.ProductCategory;
import com.henrae1001.springbootmall.dto.ProductQueryParams;
import com.henrae1001.springbootmall.dto.ProductRequest;
import com.henrae1001.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
