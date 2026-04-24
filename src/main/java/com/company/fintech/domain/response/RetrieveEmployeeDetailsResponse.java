package com.company.fintech.domain.response;

import com.company.fintech.base.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class RetrieveEmployeeDetailsResponse extends BaseResponse {
    private List<EmployeeDetails> employeeDetailsList;
}
