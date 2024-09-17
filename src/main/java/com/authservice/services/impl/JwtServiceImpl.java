package com.authservice.services.impl;

import com.authservice.common.dtos.TokenResponse;
import com.authservice.services.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtServiceImpl implements JwtService {
    private final String secretToken;

    public JwtServiceImpl(@Value("${jwt.secret}") String secretToken) {
        this.secretToken = secretToken;
    }

    @Override
    public TokenResponse generateToken(Long userId) {
        Date experationDate = new Date(Long.MAX_VALUE);

        String token = Jwts.builder()
                .setSubject(String.valueOf(userId))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(experationDate)
                .signWith(SignatureAlgorithm.HS512, this.secretToken)
                .compact();

        return TokenResponse.builder()
                .accessToken(token)
                .build();
    }

    @Override
    public Claims getClaims(String token) {
        return null;
    }

    @Override
    public boolean isExpired(String token) {
        return false;
    }

    @Override
    public Integer extractUserId(String token) {
        return 0;
    }
}
