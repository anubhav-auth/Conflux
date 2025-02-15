package com.anubhavauth.conflux.entities.persistentEntities;

import com.anubhavauth.conflux.entities.utils.Status;
import com.anubhavauth.conflux.utils.NullChecker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "orgs")
public class Organisation extends NullChecker {
    @Id
    private UUID _id;
    private String name;
    private String description;
    private String contactEmail;
    private String contactPhone;
    private String address;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}