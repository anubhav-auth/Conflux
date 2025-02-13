package com.anubhavauth.conflux.entities;

import com.anubhavauth.conflux.entities.utils.Status;
import com.anubhavauth.conflux.entities.utils.Type;
import com.sun.jdi.PrimitiveValue;
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
@Document(collection = "notificationLogs")
public class NotificationLog {
    private UUID _id;
    private UUID organisationId;
    private UUID eventId;
    private Type type;
    private Status status;
    private LocalDateTime sentAt;
    private String errorMessage;
}
