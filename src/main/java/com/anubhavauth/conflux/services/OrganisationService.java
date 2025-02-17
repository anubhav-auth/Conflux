package com.anubhavauth.conflux.services;

import com.anubhavauth.conflux.entities.dtos.OrganisationDTO;
import com.anubhavauth.conflux.entities.persistentEntities.Organisation;
import com.anubhavauth.conflux.entities.utils.Status;
import com.anubhavauth.conflux.repository.OrganisationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrganisationService {

    private final OrganisationRepo organisationRepo;

    @Autowired
    OrganisationService(OrganisationRepo organisationRepo) {
        this.organisationRepo = organisationRepo;
    }

    @Transactional
    public List<Organisation> getAllOrg() {
        return organisationRepo.findAll();
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
                .build();
    }

    @Transactional
    public Organisation getOrgById(String id) {
        Optional<Organisation> byId = organisationRepo.findById(UUID.fromString(id));
        if (byId.isPresent()) return byId.get();
        else throw new RuntimeException("No organisation with that id present");
    }

    @Transactional
    public OrganisationDTO updateOrgById(String id, OrganisationDTO organisationDTO){
        Optional<Organisation> byId = organisationRepo.findById(UUID.fromString(id));

        if (byId.isPresent()){
            Organisation organisation = byId.get();
            organisation.setName(organisationDTO.getName());
            organisation.setDescription(organisationDTO.getDescription());
            organisation.setContactEmail(organisationDTO.getContactEmail());
            organisation.setContactPhone(organisationDTO.getContactPhone());
            organisation.setAddress(organisationDTO.getAddress());
            organisation.setUpdatedAt(LocalDateTime.now());
            organisationRepo.save(organisation);
            return organisationDTO;
        }
        else throw new RuntimeException("Organisation doesnt exist");
    }

    @Transactional
    public void deleteOrgById(String id){
        Optional<Organisation> byId = organisationRepo.findById(UUID.fromString(id));

        if (byId.isPresent()){
            organisationRepo.deleteById(UUID.fromString(id));
        }
        else throw new RuntimeException("Organisation doesnt exist");
    }
}
