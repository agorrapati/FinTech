package com.company.fintech.controller;

import com.company.fintech.WebResponse.WebResponse;
import com.company.fintech.base.BaseController;
import com.company.fintech.constants.APIConstant;
import com.company.fintech.domain.request.RetrieveEmployeeDetailsReq;
import com.company.fintech.domain.response.RetrieveEmployeeDetailsResponse;
import com.company.fintech.service.EmployeeDetailsService;
import com.company.fintech.validator.EmployeeDetailsValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(APIConstant.API_BASE_RETRIEVE_URL)
public class EmployeeDetailsController extends BaseController {

    @Autowired
    private EmployeeDetailsValidator employeeDetailsValidator;

    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    @PostMapping(APIConstant.API_RETRIEVE_EMPLOYEE_DETAILS)
    public ResponseEntity<WebResponse> getEmployeeDetails(@RequestBody RetrieveEmployeeDetailsReq retrieveEmployeeDetailsReqObj) throws Exception{
        ResponseEntity<WebResponse> responseEntity = employeeDetailsValidator.validatorEmployeeDetails(retrieveEmployeeDetailsReqObj);

        if(Objects.isNull(responseEntity)){
            RetrieveEmployeeDetailsResponse retrieveEmployeeDetails = employeeDetailsService.retrieveEmployeeDetails(retrieveEmployeeDetailsReqObj);
            responseEntity = createSyncResponse(retrieveEmployeeDetails);
        }
        return responseEntity;
    }

}
