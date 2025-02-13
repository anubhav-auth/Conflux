package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizations/{orgId}/dashboard")
public class DashboardController {

    @GetMapping
    public void getDashboard(@PathVariable String orgId) {
        // Fetch aggregated statistics (event counts, registration numbers, performance metrics)
    }

    @GetMapping("/events")
    public void getEventAnalytics(@PathVariable String orgId) {
        // Detailed analytics for individual events
    }
}

