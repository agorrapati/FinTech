package com.company.fintech.base;

import com.company.fintech.WebResponse.ErrorDetails;
import com.company.fintech.WebResponse.WebResponse;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Component
public class BaseValidator {
    public ErrorDetails buildValidationErrorDetails() {
        return new ErrorDetails(BAD_REQUEST.value(),"validation Error . Check error field for details");
    }

    public ResponseEntity<WebResponse> buildErrorResponseEntity(ErrorDetails errorDetails) {
        ResponseEntity<WebResponse> responseEntity = null;
        if(CollectionUtils.isNotEmpty(errorDetails.getErrors())){
            WebResponse responseVal = WebResponse.builder().responseStatusCode(1001).errorDetails(errorDetails).build();
            responseEntity = ResponseEntity.badRequest().body(responseVal);
        }
        return responseEntity;
    }


    public void mandatoryFieldValidation(ErrorDetails errorDetails, String fieldName, String fieldValue) {

        if(StringUtils.isBlank(fieldValue)){
            errorDetails.addMandatoryValidationError(fieldName);
        }
    }
}
