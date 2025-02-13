package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations/{orgId}/notifications")
public class NotificationController {

    @PostMapping("/send")
    public void sendNotification(@PathVariable String orgId) {
        // Trigger an email notification (e.g., registration confirmation, event reminders)
    }

    @GetMapping("/settings")
    public void getNotificationSettings(@PathVariable String orgId) {
        // Retrieve notification settings for the organization
    }

    @PutMapping("/settings")
    public void updateNotificationSettings(@PathVariable String orgId) {
        // Update notification settings
    }
}

