package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations/{orgId}/events/{eventId}/teams")
public class TeamController {

    @GetMapping
    public void listTeams(@PathVariable String orgId, @PathVariable String eventId) {
        // List all teams for an event
    }

    @GetMapping("/{teamId}")
    public void getTeam(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String teamId) {
        // Retrieve details of a specific team
    }

    @PostMapping
    public void createTeam(@PathVariable String orgId, @PathVariable String eventId) {
        // Create a new team (by an organizer)
    }

    @PutMapping("/{teamId}")
    public void updateTeam(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String teamId) {
        // Update team details
    }

    @DeleteMapping("/{teamId}")
    public void deleteTeam(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String teamId) {
        // Disband or delete a team
    }
}

