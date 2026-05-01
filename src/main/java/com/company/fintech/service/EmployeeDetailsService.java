package com.company.fintech.service;

import com.company.fintech.domain.request.RetrieveEmployeeDetailsReq;
import com.company.fintech.domain.response.EmployeeDetails;
import com.company.fintech.domain.response.RetrieveEmployeeDetailsResponse;
import com.fasterxml.jackson.core.type.TypeReference;
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

        /*
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "your_username";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            if (conn != null) {
                System.out.println("Connected to the Oracle database!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }

*/

        InputStream inputStream = new ClassPathResource("employeeDetails.json").getInputStream();
        List<EmployeeDetails> responseList  = objectMapper.readValue(inputStream, new TypeReference<List<EmployeeDetails>>() {
        });
        retrieveEmployeeDetailsResponse.setEmployeeDetailsList(responseList);
        return retrieveEmployeeDetailsResponse;
    }
}
