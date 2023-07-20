package com.learning.companyresourcemanagement.dto;

import javax.validation.constraints.NotBlank;

public class CategoryDto{
    private Long id;
    @NotBlank(message = "Category name is required")
    private String name;
}
