package com.henrae1001.springbootmall.dao;

import com.henrae1001.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer ProductId);
}
