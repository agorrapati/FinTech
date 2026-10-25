package com.company.fintech.service;

import com.company.fintech.domain.request.RetrieveEmployeeDetailsReq;
import com.company.fintech.domain.response.EmployeeDetails;
import com.company.fintech.domain.response.RetrieveEmployeeDetailsResponse;
import com.company.fintech.domain.response.RetrieveEmployeeDetailsResponseById;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@Service
public class EmployeeDetailsService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public RetrieveEmployeeDetailsResponse retrieveEmployeeDetails(RetrieveEmployeeDetailsReq retrieveEmployeeDetailsReqObj) throws IOException {
        RetrieveEmployeeDetailsResponse retrieveEmployeeDetailsResponse = RetrieveEmployeeDetailsResponse.builder().build();

        InputStream inputStream = new ClassPathResource("employeeDetails.json").getInputStream();
        List<EmployeeDetails> responseList  = objectMapper.readValue(inputStream, new TypeReference<List<EmployeeDetails>>() {
        });
        retrieveEmployeeDetailsResponse.setEmployeeDetailsList(responseList);
        return retrieveEmployeeDetailsResponse;
    }


    public RetrieveEmployeeDetailsResponseById retrieveEmployeeDetailsById(RetrieveEmployeeDetailsReq retrieveEmployeeDetailsReqObj) throws IOException {
        RetrieveEmployeeDetailsResponseById retrieveEmployeeDetailsResponse = RetrieveEmployeeDetailsResponseById.builder().build();

        try (InputStream inputStream = new ClassPathResource("employeeDetails.json").getInputStream()) {
            JsonNode root = objectMapper.readTree(inputStream);

            if (root.isArray()) {
                for (JsonNode node : root) {
                    if (node.path("employeeId").asText().equals(retrieveEmployeeDetailsReqObj.getUserId())) {
                        EmployeeDetails employeeDetails = objectMapper.treeToValue(node, EmployeeDetails.class);
                        retrieveEmployeeDetailsResponse.setEmployeeDetails(employeeDetails);
                        break; // found the employee, stop searching
                    }
                }
            }
        }
        return retrieveEmployeeDetailsResponse;
    }
}
