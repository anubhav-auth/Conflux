package com.anubhavauth.conflux.entities;

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
@Document(collection = "evaluation")
public class Evaluation {
    private UUID _id;
    private UUID organisationId;
    private UUID eventId;
    private UUID submissionId;
    private UUID judgeId;
    private Integer score;
    private String comments;
    private LocalDateTime evaluatedAt;
}
