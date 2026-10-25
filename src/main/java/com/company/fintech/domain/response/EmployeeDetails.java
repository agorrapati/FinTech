package com.company.fintech.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDetails {
    @JsonProperty("employeeName")
    private String employeeName;
    @JsonProperty("employeeId")
    private int employeeId;
    @JsonProperty("employeeDesignation")
    private String employeeDesignation;

    @JsonProperty("contactNumber")
    private String contactNumber;
    @JsonProperty("officialEmail")
    private String officialEmail;
    @JsonProperty("personalEmail")
    private String personalEmail;
    @JsonProperty("courses")
    private List<Course> courses;

}
