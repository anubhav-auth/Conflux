package com.anubhavauth.conflux.entities.dtos;

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
public class EvaluationDTO {
    private UUID organisationId;
    private UUID eventId;
    private UUID submissionId;
    private UUID judgeId;
    private LocalDateTime evaluatedAt;
}
