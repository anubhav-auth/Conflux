package com.anubhavauth.conflux.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organizations/{orgId}/events/{eventId}")
public class CompetitionController {

    // Submissions endpoints
    @GetMapping("/submissions")
    public void listSubmissions(@PathVariable String orgId, @PathVariable String eventId) {
        // List all submissions for the event
    }

    @GetMapping("/submissions/{submissionId}")
    public void getSubmission(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String submissionId) {
        // Retrieve details of a specific submission
    }

    @PostMapping("/submissions")
    public void createSubmission(@PathVariable String orgId, @PathVariable String eventId) {
        // Submit a new project (link/file upload)
    }

    @PutMapping("/submissions/{submissionId}")
    public void updateSubmission(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String submissionId) {
        // Update an existing submission
    }

    @DeleteMapping("/submissions/{submissionId}")
    public void deleteSubmission(@PathVariable String orgId, @PathVariable String eventId, @PathVariable String submissionId) {
        // Delete a submission
    }

    // Evaluations & Leaderboard endpoints
    @PostMapping("/evaluations")
    public void submitEvaluation(@PathVariable String orgId, @PathVariable String eventId) {
        // Allow judges to submit scores/evaluations for submissions
    }

    @GetMapping("/leaderboard")
    public void getLeaderboard(@PathVariable String orgId, @PathVariable String eventId) {
        // Generate a leaderboard based on evaluations
    }
}
