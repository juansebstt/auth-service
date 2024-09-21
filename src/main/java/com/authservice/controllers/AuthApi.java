package com.authservice.controllers;

import com.authservice.common.constants.ApiPathConstants;
import com.authservice.common.dtos.LoginRequest;
import com.authservice.common.dtos.TokenResponse;
import com.authservice.common.dtos.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathConstants.V1_ROUTE + ApiPathConstants.AUTH_ROUTE)
public interface AuthApi {

    @PostMapping("/register")
    ResponseEntity<TokenResponse> createUser(@RequestBody @Valid UserRequest userRequest);

    @PostMapping("/login")
    ResponseEntity<TokenResponse> loginUser(@RequestBody @Valid LoginRequest loginRequest);

    @GetMapping
    ResponseEntity<String> getUser(@RequestAttribute(name = "X-User-Id") String userId);
}
