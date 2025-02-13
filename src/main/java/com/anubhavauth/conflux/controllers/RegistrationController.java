package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations/{orgId}/events/{eventId}/registrations")
public class RegistrationController {

    @GetMapping
    public void listRegistrations(@PathVariable String orgId, @PathVariable String eventId) {
        // List all registrations for a given event
    }

    @GetMapping("/{registrationId}")
    public void getRegistration(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String registrationId) {
        // Retrieve registration details for a participant or team
    }

    @PostMapping
    public void createRegistration(@PathVariable String orgId, @PathVariable String eventId) {
        // Submit a new registration
    }

    @PutMapping("/{registrationId}")
    public void updateRegistration(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String registrationId) {
        // Update registration information
    }

    @DeleteMapping("/{registrationId}")
    public void deleteRegistration(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String registrationId) {
        // Cancel a registration
    }
}
