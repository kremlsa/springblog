package com.example.demo.payload.request;

import com.example.demo.annotations.PasswordMatches;
import com.example.demo.annotations.ValidEmail;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignUpRequest {
    @Email(message = "Should have email")
    @NotBlank(message = "email required")
    @ValidEmail
    private String email;
    @NotEmpty(message = "Enter name")
    private String username;
    @NotEmpty(message = "Enter name")
    private String lastname;
    @NotEmpty(message = "Enter name")
    private String firstname;
    @NotEmpty(message = "Enter pass")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
}
