package com.company.fintech.validator;

import com.company.fintech.WebResponse.ErrorDetails;
import com.company.fintech.WebResponse.WebResponse;
import com.company.fintech.base.BaseValidator;
import com.company.fintech.constants.Constant;
import com.company.fintech.domain.request.LoginUserDetailsReq;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoginValidator extends BaseValidator {

    public ResponseEntity<WebResponse> validatorLoginUser(LoginUserDetailsReq loginUserDetailsReq) {
        ErrorDetails errorDetails = buildValidationErrorDetails();
        //mandatoryFieldValidation(errorDetails, Constant.INITIATOR_ID, retrieveEmployeeDetailsReqObj.getInitiatorId());
        mandatoryFieldValidation(errorDetails, Constant.USERNAME, loginUserDetailsReq.getUsername());
        mandatoryFieldValidation(errorDetails,Constant.PASSWORD, loginUserDetailsReq.getPassword());

        return buildErrorResponseEntity(errorDetails);
    }
}
