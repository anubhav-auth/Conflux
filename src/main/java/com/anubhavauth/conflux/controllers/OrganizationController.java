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
        try{
            List<Organisation> allOrg = organisationService.getAllOrg();
            return ResponseEntity.ok(allOrg);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity<OrganisationDTO> createOrganization(@RequestBody Organisation organisation) {
        try {
            OrganisationDTO org = organisationService.createOrg(organisation);
            return new ResponseEntity<>(org, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/{orgId}")
    public ResponseEntity<Organisation> getOrganization(@PathVariable String orgId) {
        try {
            Organisation orgById = organisationService.getOrgById(orgId);
            return ResponseEntity.ok(orgById);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/{orgId}")
    public ResponseEntity<OrganisationDTO> updateOrganization(@PathVariable String orgId, @RequestBody OrganisationDTO organisationDTO) {
        try {
            OrganisationDTO organisationDTO1 = organisationService.updateOrgById(orgId, organisationDTO);
            return ResponseEntity.ok(organisationDTO1);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/{orgId}")
    public String deleteOrganization(@PathVariable String orgId) {
        try {
            organisationService.deleteOrgById(orgId);
            return "org deleted";
        } catch (Exception e) {
            return "org not deleted";
        }
    }
}
