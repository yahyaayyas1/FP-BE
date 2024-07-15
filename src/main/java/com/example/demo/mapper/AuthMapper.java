package com.example.demo.mapper;

import com.example.demo.dto.auth.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AuthMapper {
    public LoginResponse toLoginResponse(ResponseEntity<Map> response) {
        return LoginResponse.builder()
                .accessToken(response.getBody().get("access_token"))
                .tokenType(response.getBody().get("token_type"))
                .refreshToken(response.getBody().get("refresh_token"))
                .expiresIn(response.getBody().get("expires_in"))
                .scope(response.getBody().get("scope"))
                .jti(response.getBody().get("jti"))
                .build();
    }
}
