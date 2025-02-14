package com.anubhavauth.conflux.repository;

import com.anubhavauth.conflux.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepo extends MongoRepository<User, UUID> {
    User findByUserName(String userName);
}
