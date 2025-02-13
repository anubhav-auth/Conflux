package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations/{orgId}/users")
public class UserController {

    @GetMapping
    public void listUsers(@PathVariable String orgId) {
        // List all users for an organization
    }

    @GetMapping("/{userId}")
    public void getUser(@PathVariable String orgId, @PathVariable String userId) {
        // Retrieve details of a specific user
    }

    @PostMapping
    public void createUser(@PathVariable String orgId) {
        // Create/add a new user (by an organization admin)
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

