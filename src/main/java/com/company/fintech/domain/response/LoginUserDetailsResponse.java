package com.company.fintech.domain.response;

import com.company.fintech.base.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginUserDetailsResponse extends BaseResponse {
    private EmployeeDetails employeeDetails;
//    public String employeeName;
//    public String employeeDesignation;
    public boolean validUser;
//    public int employeeId;

}
