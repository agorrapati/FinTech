package com.company.fintech.WebResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Generated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetails {
    private Integer code;
    private String message;
    private List<ValidationError> errors;

    @Generated
    public Integer getCode() {
        return code;
    }

    @Generated
    public void setCode(Integer code) {
        this.code = code;
    }

    @Generated
    public String getMessage() {
        return message;
    }

    @Generated
    public void setMessage(String message) {
        this.message = message;
    }

    @Generated
    public List<ValidationError> getErrors() {
        return errors;
    }

    @Generated
    public void setErrors(List<ValidationError> errors) {
        this.errors = errors;
    }

    ErrorDetails() {

    }

    public ErrorDetails(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void addMandatoryValidationError(String fieldName) {
        if (Objects.isNull(this.errors)) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(new ValidationError(fieldName, "Missing Mandatory parameter"));
    }


    public static class ValidationError {
        private final String field;
        private final String message;

        @Generated
        public String getField() {
            return field;
        }

        @Generated
        public String getMessage() {
            return message;
        }

        public ValidationError(String field, String message) {
            this.field = field;
            this.message = message;
        }
    }
}
