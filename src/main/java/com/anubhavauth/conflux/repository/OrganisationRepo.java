package com.anubhavauth.conflux.repository;

import com.anubhavauth.conflux.entities.persistentEntities.Organisation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface OrganisationRepo extends MongoRepository<Organisation, UUID> {
    Optional<Object> findOrganisationByName(String name);
}
