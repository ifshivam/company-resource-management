package com.learning.companyresourcemanagement.dto;

import javax.validation.constraints.NotBlank;

public class UserDto{
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Password is required")
    private String password;
    private String role;
    private Long categoryId;
}
