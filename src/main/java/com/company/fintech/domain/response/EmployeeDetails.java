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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDetails {
    @JsonProperty("employeeName")
    private String employeeName;
    @JsonProperty("employeeId")
    private int employeeId;
    @JsonProperty("employeeDesignation")
    private String employeeDesignation;


    public static class EmployeeDetailsBuilder {
        private String employeeName;
        private int employeeId;
        private String employeeDesignation;

        EmployeeDetailsBuilder() {
        }

        public EmployeeDetailsBuilder employeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeDetailsBuilder employeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeDetailsBuilder employeeDesignation(String employeeDesignation) {
            this.employeeDesignation = employeeDesignation;
            return this;
        }



        public String toString() {
            return "EmployeeDetails.EmployeeDetailsBuilder(employeeName=" + this.employeeName + ", employeeId=" + this.employeeId + ", employeeDesignation=" + this.employeeDesignation + ")";
        }
    }
}
