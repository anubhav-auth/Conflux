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
@Document(collection = "notificationSetting")
public class NotificationSetting {
    private UUID _id;
    private UUID organisationId;
    private String provider;
    private String apiKey;
    private String senderEmail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}