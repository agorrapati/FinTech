package com.company.fintech.service;

import com.company.fintech.domain.request.LoginUserDetailsReq;
import com.company.fintech.domain.request.RetrieveEmployeeDetailsReq;
import com.company.fintech.domain.response.EmployeeDetails;
import com.company.fintech.domain.response.LoginUserDetailsResponse;
import com.company.fintech.domain.response.RetrieveEmployeeDetailsResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class LoginService {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public LoginUserDetailsResponse loginUserDetails(LoginUserDetailsReq loginUserDetailsReq) throws IOException {

        LoginUserDetailsResponse loginUserDetailsResponse = new LoginUserDetailsResponse();
        InputStream inputStream = new ClassPathResource("employeeDetails.json").getInputStream();
        JsonNode root = objectMapper.readTree(inputStream);

        if(root.isArray()){
            for (JsonNode node: root){
                if(node.get("employeeName").asText().equals(loginUserDetailsReq.username)){
                    loginUserDetailsResponse.setEmployeeId(node.get("employeeId").asInt());
                    loginUserDetailsResponse.setEmployeeName(node.get("employeeName").asText());
                    loginUserDetailsResponse.setEmployeeDesignation(node.get("employeeDesignation").asText());
                    loginUserDetailsResponse.setValidUser(true);
                    return loginUserDetailsResponse;
                }else{
                    loginUserDetailsResponse.setValidUser(false);
                }
            }
        }
        return  loginUserDetailsResponse;
    }

}
