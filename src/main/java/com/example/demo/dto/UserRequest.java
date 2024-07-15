package com.example.demo.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "Must not empty")
    private String username;
    @NotBlank(message = "Must not empty")
    private String emailAddress;
    @NotBlank(message = "Must not empty")
    private String password;
}
