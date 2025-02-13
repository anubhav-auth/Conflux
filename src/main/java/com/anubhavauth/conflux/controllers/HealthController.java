package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public void healthCheck() {
        // Health check endpoint for system monitoring
    }

    @GetMapping("/metrics")
    public void getMetrics() {
        // Retrieve performance and usage metrics
    }
}

