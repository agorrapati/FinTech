package com.company.fintech.validator;

import com.company.fintech.WebResponse.ErrorDetails;
import com.company.fintech.WebResponse.WebResponse;
import com.company.fintech.base.BaseValidator;
import com.company.fintech.constants.Constant;
import com.company.fintech.domain.request.RetrieveEmployeeDetailsReq;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDetailsValidator extends BaseValidator {
    public ResponseEntity<WebResponse> validatorEmployeeDetails(RetrieveEmployeeDetailsReq retrieveEmployeeDetailsReqObj) {
        ErrorDetails errorDetails = buildValidationErrorDetails();
        mandatoryFieldValidation(errorDetails, Constant.INITIATOR_ID,retrieveEmployeeDetailsReqObj.getInitiatorId());
        mandatoryFieldValidation(errorDetails,Constant.USER_ID,retrieveEmployeeDetailsReqObj.getUserId());

        return buildErrorResponseEntity(errorDetails);
    }
}
