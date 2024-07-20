package com.example.jangkau.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class LoginResponse {
    private UUID userId;
    private Object accessToken;
    private Object tokenType;
    private Object refreshToken;
    private Object expiresIn;
    private Object scope;
    private Object jti;
}
