package com.anubhavauth.conflux.entities.dtos;

import com.anubhavauth.conflux.entities.utils.Role;
import com.anubhavauth.conflux.entities.utils.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String userName;
    private UUID organisationId;
    private LocalDateTime createdAt;
}