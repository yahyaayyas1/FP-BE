package com.example.demo.service;

import com.example.demo.dto.auth.*;
import com.example.demo.entity.User;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.security.Principal;

public interface AuthService {

    User register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    Object sendEmailOtp(EmailRequest request, String subject);

    Object confirmOtp(String otp);

    Object checkOtpValid(OtpRequest otp);

    Object resetPassword(ResetPasswordRequest request);

    User getCurrentUser(Principal principal);

    Object signWithGoogle(MultiValueMap<String, String> parameters) throws IOException;
}
