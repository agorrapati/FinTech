package com.company.fintech.domain.response;

import com.company.fintech.base.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@Builder
public class RetrieveEmployeeDetailsResponseById extends BaseResponse {
    private EmployeeDetails employeeDetails;
}
