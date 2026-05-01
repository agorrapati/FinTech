package com.company.fintech.controller;

import com.company.fintech.WebResponse.WebResponse;
import com.company.fintech.base.BaseController;
import com.company.fintech.constants.APIConstant;
import com.company.fintech.domain.request.LoginUserDetailsReq;
import com.company.fintech.domain.request.RetrieveEmployeeDetailsReq;
import com.company.fintech.domain.response.LoginUserDetailsResponse;
import com.company.fintech.service.LoginService;
import com.company.fintech.validator.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(APIConstant.API_BASE_LOGIN_URL)
public class LoginController extends BaseController {

    @Autowired
    LoginValidator loginValidator;

    @Autowired
    LoginService loginService;

    @PostMapping(APIConstant.API_LOGIN_URL)
    public ResponseEntity<WebResponse> validateUser(@RequestBody LoginUserDetailsReq loginUserDetailsReq) throws Exception {

        ResponseEntity<WebResponse> responseEntity = loginValidator.validatorLoginUser(loginUserDetailsReq);
        if(Objects.isNull(responseEntity)){
            LoginUserDetailsResponse loginUserDetailsResponse = loginService.loginUserDetails(loginUserDetailsReq);
            responseEntity =  createSyncResponse(loginUserDetailsResponse);
        }
        return responseEntity;
    }

}
