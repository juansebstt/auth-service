package com.authservice.services.impl;

import com.authservice.common.dtos.TokenResponse;
import com.authservice.common.dtos.UserRequest;
import com.authservice.repositories.UserRepository;
import com.authservice.services.AuthService;
import com.authservice.services.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AuthServiceImpl(UserRepository userRepository, JwtService jwtService) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }

    @Override
    public TokenResponse createUser(UserRequest userRequest) {
        return null;
    }
}
