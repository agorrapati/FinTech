package com.company.fintech.domain.response;

import com.company.fintech.base.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class RetrieveEmployeeDetailsResponse extends BaseResponse {

    private List<EmployeeDetails> employeeDetailsList;

    public RetrieveEmployeeDetailsResponse(List<EmployeeDetails> employeeDetailsList) {
        this.employeeDetailsList = employeeDetailsList;
    }

    public RetrieveEmployeeDetailsResponse() {
    }

    public static RetrieveEmployeeDetailsResponseBuilder builder() {
        return new RetrieveEmployeeDetailsResponseBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RetrieveEmployeeDetailsResponse)) return false;
        final RetrieveEmployeeDetailsResponse other = (RetrieveEmployeeDetailsResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$employeeDetailsList = this.getEmployeeDetailsList();
        final Object other$employeeDetailsList = other.getEmployeeDetailsList();
        if (this$employeeDetailsList == null ? other$employeeDetailsList != null : !this$employeeDetailsList.equals(other$employeeDetailsList))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RetrieveEmployeeDetailsResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $employeeDetailsList = this.getEmployeeDetailsList();
        result = result * PRIME + ($employeeDetailsList == null ? 43 : $employeeDetailsList.hashCode());
        return result;
    }

    public String toString() {
        return "RetrieveEmployeeDetailsResponse(employeeDetailsList=" + this.getEmployeeDetailsList() + ")";
    }

    public List<EmployeeDetails> getEmployeeDetailsList() {
        return this.employeeDetailsList;
    }

    public void setEmployeeDetailsList(List<EmployeeDetails> employeeDetailsList) {
        this.employeeDetailsList = employeeDetailsList;
    }

    public static class RetrieveEmployeeDetailsResponseBuilder {
        private List<EmployeeDetails> employeeDetailsList;

        RetrieveEmployeeDetailsResponseBuilder() {
        }

        public RetrieveEmployeeDetailsResponseBuilder employeeDetailsList(List<EmployeeDetails> employeeDetailsList) {
            this.employeeDetailsList = employeeDetailsList;
            return this;
        }

        public RetrieveEmployeeDetailsResponse build() {
            return new RetrieveEmployeeDetailsResponse(this.employeeDetailsList);
        }

        public String toString() {
            return "RetrieveEmployeeDetailsResponse.RetrieveEmployeeDetailsResponseBuilder(employeeDetailsList=" + this.employeeDetailsList + ")";
        }
    }
}
