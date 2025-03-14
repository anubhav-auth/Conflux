package com.anubhavauth.conflux.repository;

import com.anubhavauth.conflux.entities.persistentEntities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepo extends MongoRepository<User, UUID> {
    Optional<User> findByUserName(String userName);
}
