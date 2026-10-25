package com.company.fintech.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Course {
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("category")
    private String category;
    @JsonProperty("durationHours")
    private double durationHours;      // double, because values like 1.5 exist
    @JsonProperty("status")
    private String status;             // "completed" or "in-progress"

    // Completed courses only
    @JsonProperty("completedOn")
    private String completedOn;        // "yyyy-MM-dd"

    // In-progress courses only
    @JsonProperty("progressPercent")
    private Integer progressPercent;   // Integer, so it can be null for completed courses
    @JsonProperty("lastOpened")
    private String lastOpened;         // "yyyy-MM-dd"
    @JsonProperty("dueDate")
    private String dueDate;           // "yyyy-MM-dd"
}
