package com.anubhavauth.conflux.controllers;

import com.anubhavauth.conflux.entities.dtos.UserDTO;
import com.anubhavauth.conflux.entities.persistentEntities.User;
import com.anubhavauth.conflux.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations/{orgId}/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public void listUsers(@PathVariable String orgId) {
        // List all users for an organization
    }

    @GetMapping("/{userId}")
    public void getUser(@PathVariable String orgId, @PathVariable String userId) {
        // Retrieve details of a specific user
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@PathVariable String orgId, @RequestBody User user) {
        try {
            UserDTO user1 = userService.createUser(user, orgId);
            return ResponseEntity.ok(user1);
        } catch (Exception e) {
            throw new RuntimeException("User already exists");
        }
    }

    @PutMapping("/{userId}")
    public void updateUser(@PathVariable String orgId, @PathVariable String userId) {
        // Update user information (roles, profile details, etc.)
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String orgId, @PathVariable String userId) {
        // Remove a user from the organization
    }
}

