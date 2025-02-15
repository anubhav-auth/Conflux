package com.anubhavauth.conflux.controllers;

import com.anubhavauth.conflux.entities.dtos.OrganisationDTO;
import com.anubhavauth.conflux.entities.persistentEntities.Organisation;
import com.anubhavauth.conflux.services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    private OrganisationService organisationService;

    @Autowired
    OrganizationController(OrganisationService organisationService){
        this.organisationService = organisationService;
    }

    @GetMapping
    public ResponseEntity<List<Organisation>> getAllOrg(){
        List<Organisation> allOrg = organisationService.getAllOrg();
        return ResponseEntity.ok(allOrg);
    }

    @PostMapping
    public ResponseEntity<OrganisationDTO> createOrganization(@RequestBody Organisation organisation) {
        OrganisationDTO org = organisationService.createOrg(organisation);
        return new ResponseEntity<>(org, HttpStatus.OK);
    }


    @GetMapping("/{orgId}")
    public ResponseEntity<Organisation> getOrganization(@PathVariable String orgId) {
        Organisation orgById = organisationService.getOrgById(orgId);
        return ResponseEntity.ok(orgById);
    }

    @PutMapping("/{orgId}")
    public void updateOrganization(@PathVariable String orgId) {
        // Update organization details
    }

    @DeleteMapping("/{orgId}")
    public void deleteOrganization(@PathVariable String orgId) {
        // Delete an organization (if applicable)
    }
}
