package com.anubhavauth.conflux.entities.persistentEntities;

import com.anubhavauth.conflux.entities.utils.Role;
import com.anubhavauth.conflux.entities.utils.Status;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "users")
public class User {
    private UUID _id;
    private UUID organisationId;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

