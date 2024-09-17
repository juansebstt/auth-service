package com.authservice.services.impl;

import com.authservice.common.dtos.TokenResponse;
import com.authservice.common.dtos.UserRequest;
import com.authservice.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public TokenResponse createUser(UserRequest userRequest) {
        return null;
    }
}
