package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String healthCheck() {
        return "all ok";
    }

    @GetMapping("/metrics")
    public void getMetrics() {
        // Retrieve performance and usage metrics
    }
}

