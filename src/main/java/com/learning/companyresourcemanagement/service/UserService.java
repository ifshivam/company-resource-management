package com.learning.companyresourcemanagement.service;

import com.learning.companyresourcemanagement.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService{
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    User findByUsername(String username);
    User saveUser(User user);
    void deleteUser(Long userId);
}
