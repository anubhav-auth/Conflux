package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations/{orgId}/events")
public class EventController {

    @GetMapping
    public void listEvents(@PathVariable String orgId) {
        // List all events for the organization
    }

    @GetMapping("/{eventId}")
    public void getEvent(@PathVariable String orgId, @PathVariable String eventId) {
        // Retrieve details for a specific event
    }

    @PostMapping
    public void createEvent(@PathVariable String orgId) {
        // Create a new event
    }

    @PutMapping("/{eventId}")
    public void updateEvent(@PathVariable String orgId, @PathVariable String eventId) {
        // Update event details
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable String orgId, @PathVariable String eventId) {
        // Cancel or delete an event
    }
}

