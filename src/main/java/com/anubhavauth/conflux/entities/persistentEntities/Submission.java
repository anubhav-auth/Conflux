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
@Document(collection = "submissions")
public class Submission {
    private UUID _id;
    private UUID organisationId;
    private UUID eventId;
    private UUID submittedBy;
    private String projectLink;
    private String fileUrl;
    private LocalDateTime submissionDate;
    private Status status;
    private String comments;
}

