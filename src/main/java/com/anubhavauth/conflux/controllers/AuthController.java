package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/register")
    public void register() {
        // Register a new user (and possibly initiate tenant onboarding)
    }

    @PostMapping("/login")
    public void login() {
        // Authenticate user and issue JWT token
    }

    @GetMapping("/me")
    public void getCurrentUser() {
        // Retrieve details of the currently authenticated user
    }

    @PostMapping("/logout")
    public void logout() {
        // Invalidate the current session/token
    }
}
