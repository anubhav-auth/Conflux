package com.anubhavauth.conflux.services;

import com.anubhavauth.conflux.entities.dtos.OrganisationDTO;
import com.anubhavauth.conflux.entities.persistentEntities.Organisation;
import com.anubhavauth.conflux.entities.utils.Status;
import com.anubhavauth.conflux.repository.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class OrganisationService {

    private OrganisationRepo organisationRepo;

    @Autowired
    OrganisationService(OrganisationRepo organisationRepo) {
        this.organisationRepo = organisationRepo;
    }


    @Transactional
    public OrganisationDTO createOrg(Organisation organisation) {
        organisationRepo.findOrganisationByName(organisation.getName())
                .ifPresent(org -> {
                    throw new RuntimeException("Organisation with name " + organisation.getName() + " already exists");
                });

        organisation.set_id(UUID.randomUUID());
        organisation.setStatus(Status.UNDER_REVIEW);
        organisation.setCreatedAt(LocalDateTime.now());
        organisation.setUpdatedAt(LocalDateTime.now());

        if (!organisation.hasNullField()) {
            organisationRepo.save(organisation);
        } else {
            throw new RuntimeException("Organisation fields cannot be null");
        }
        return OrganisationDTO.builder()
                .name(organisation.getName())
                .createdAt(organisation.getCreatedAt())
                .build();
    }
}
