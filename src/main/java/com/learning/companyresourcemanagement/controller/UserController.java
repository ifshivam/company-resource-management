package com.learning.companyresourcemanagement.controller;

import com.learning.companyresourcemanagement.entity.User;
import com.learning.companyresourcemanagement.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint for admin user creation
    @PostMapping("/admin")
    public User createAdminUser(@RequestBody User user) {
        user.setRole(User.Role.ADMIN);
        return userService.saveUser(user);
    }

    // Endpoint for updating user details
    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User userRequest) {
        User existingUser = userService.findByUsername(userRequest.getUsername());
        existingUser.setPassword(userRequest.getPassword());
        // Update other user details as needed
        return userService.saveUser(existingUser);
    }

    // Endpoint for deleting a user
    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }

}

