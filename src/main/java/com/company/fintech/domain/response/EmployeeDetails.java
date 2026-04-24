package com.company.fintech.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeDetails {
    private String employeeName;
    private String employeeId;
    private String employeeDesignation;

    EmployeeDetails(String employeeName, String employeeId, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDesignation = employeeDesignation;
    }

    public static EmployeeDetailsBuilder builder() {
        return new EmployeeDetailsBuilder();
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeDesignation() {
        return this.employeeDesignation;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public static class EmployeeDetailsBuilder {
        private String employeeName;
        private String employeeId;
        private String employeeDesignation;

        EmployeeDetailsBuilder() {
        }

        public EmployeeDetailsBuilder employeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeDetailsBuilder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeDetailsBuilder employeeDesignation(String employeeDesignation) {
            this.employeeDesignation = employeeDesignation;
            return this;
        }

        public EmployeeDetails build() {
            return new EmployeeDetails(this.employeeName, this.employeeId, this.employeeDesignation);
        }

        public String toString() {
            return "EmployeeDetails.EmployeeDetailsBuilder(employeeName=" + this.employeeName + ", employeeId=" + this.employeeId + ", employeeDesignation=" + this.employeeDesignation + ")";
        }
    }
}
