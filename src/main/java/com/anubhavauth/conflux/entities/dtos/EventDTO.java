package com.anubhavauth.conflux.entities.dtos;

import com.anubhavauth.conflux.entities.utils.Type;
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
public class EventDTO {
    private UUID organisationId;
    private String name;
    private LocalDateTime startDate;
    private UUID createdBy;
    private LocalDateTime createdAt;
}