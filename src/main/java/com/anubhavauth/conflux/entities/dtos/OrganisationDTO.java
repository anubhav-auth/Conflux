package com.anubhavauth.conflux.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganisationDTO {
    private String name;
    private String description;
    private String contactEmail;
    private String contactPhone;
    private String address;
}