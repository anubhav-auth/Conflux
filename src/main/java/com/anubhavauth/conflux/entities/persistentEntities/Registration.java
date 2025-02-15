package com.anubhavauth.conflux.entities.persistentEntities;

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
@Document(collection = "registrations")
public class Registration {
    private UUID _id;
    private UUID organisationId;
    private UUID eventId;
    private UUID userId;
    private UUID teamId;
    private LocalDateTime registrationDate;
    private Status status;
    private String additionalInfo;
}

