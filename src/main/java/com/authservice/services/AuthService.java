package com.authservice.services;

import com.authservice.common.dtos.LoginRequest;
import com.authservice.common.dtos.TokenResponse;
import com.authservice.common.dtos.UserRequest;

public interface AuthService {
    TokenResponse createUser(UserRequest userRequest);
    TokenResponse loginUser(LoginRequest loginRequest);
}
