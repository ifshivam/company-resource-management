package com.learning.companyresourcemanagement.repository;

import com.learning.companyresourcemanagement.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{
}
