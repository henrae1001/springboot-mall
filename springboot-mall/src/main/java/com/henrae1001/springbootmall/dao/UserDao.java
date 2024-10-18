package com.henrae1001.springbootmall.dao;

import com.henrae1001.springbootmall.dto.UserRegisterRequest;
import com.henrae1001.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
