package com.learning.companyresourcemanagement.service;

import com.learning.companyresourcemanagement.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService{
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long categoryId);
    Category saveCategory(Category category);
}
