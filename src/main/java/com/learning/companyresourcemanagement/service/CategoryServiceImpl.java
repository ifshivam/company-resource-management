package com.learning.companyresourcemanagement.service;

import com.learning.companyresourcemanagement.entity.Category;
import com.learning.companyresourcemanagement.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll().stream()
                .map(category -> new Category(category.getId()))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Category> getCategoryById(Long categoryId) throws EntityNotFoundException {
        Optional<Category> categoryOptional = categoryRepository.findById(categoryId);
        if (categoryOptional.isPresent()) {
            return categoryOptional;
        } else {
            throw new EntityNotFoundException("Category not found");
        }
    }


    @Override
    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
}
