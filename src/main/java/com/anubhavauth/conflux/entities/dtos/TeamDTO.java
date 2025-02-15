package com.anubhavauth.conflux.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamDTO {
    private UUID organisationId;
    private UUID eventId;
    private String name;
    private String description;
    private List<UUID> members;
    private LocalDateTime createdAt;
}
