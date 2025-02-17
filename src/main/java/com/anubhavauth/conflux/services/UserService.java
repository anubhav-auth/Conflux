package com.anubhavauth.conflux.services;

import com.anubhavauth.conflux.entities.dtos.UserDTO;
import com.anubhavauth.conflux.entities.persistentEntities.User;
import com.anubhavauth.conflux.entities.utils.Role;
import com.anubhavauth.conflux.entities.utils.Status;
import com.anubhavauth.conflux.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final PasswordEncoder passwordEncoder;
    UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }


    @Transactional
    public UserDTO createUser(User user, String id){
        Optional<User> byUserName = userRepo.findByUserName(user.getUserName());
        if (byUserName.isPresent()) {
            throw new RuntimeException("User already exists");
        }
        user.set_id(UUID.randomUUID());
        user.setOrganisationId(UUID.fromString(id));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.valueOf("USER"));
        user.setStatus(Status.ACTIVE);
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User savedUser = userRepo.save(user);
        return new UserDTO(savedUser);
    }


}
