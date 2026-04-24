package com.company.fintech.base;


import com.company.fintech.WebResponse.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponse {
    private ErrorDetails errorDetails;

    @Generated
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    @Generated
    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }
}
