package com.henrae1001.springbootmall.service;

import com.henrae1001.springbootmall.dto.UserLoginRequest;
import com.henrae1001.springbootmall.dto.UserRegisterRequest;
import com.henrae1001.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
