package com.company.fintech.WebResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Generated;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebResponse {
    private int statusCode;
    private String responseMessage;
    private Object responseValue;
    private ErrorDetails errorDetails;

    @Generated
    public static WebResponseBuilder builder() {
        return new WebResponseBuilder();
    }

    @Generated
    public int getStatusCode() {
        return statusCode;
    }

    @Generated
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Generated
    public String getResponseMessage() {
        return responseMessage;
    }

    @Generated
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Generated
    public Object getResponseValue() {
        return responseValue;
    }

    @Generated
    public void setResponseValue(Object responseValue) {
        this.responseValue = responseValue;
    }

    @Generated
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    @Generated
    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WebResponse that = (WebResponse) o;
        return statusCode == that.statusCode && Objects.equals(responseMessage, that.responseMessage) && Objects.equals(responseValue, that.responseValue) && Objects.equals(errorDetails, that.errorDetails);
    }

    @Generated
    public int hashCode() {
        return Objects.hash(statusCode, responseMessage, responseValue, errorDetails);
    }

    @Generated
    public String toString() {
        return "WebResponse{" +
                "statusCode=" + statusCode +
                ", responseMessage='" + responseMessage + '\'' +
                ", responseValue=" + responseValue +
                ", errorDetails=" + errorDetails +
                '}';
    }

    @Generated
    public WebResponse(int responseStatusCode, String responseMessage, Object responseValue, ErrorDetails errorDetails) {
        this.responseValue = responseValue;
        this.statusCode = responseStatusCode;
        this.responseMessage = responseMessage;
        this.errorDetails = errorDetails;
    }

    @Generated
    public WebResponse() {

    }

    @Generated
    public static class WebResponseBuilder {
        @Generated
        private int responseStatusCode;
        @Generated
        private String responseMessage;
        @Generated
        private Object responseValue;
        @Generated
        private ErrorDetails errorDetails;
        private int statusCode;

        WebResponseBuilder() {
        }

        @Generated
        public WebResponseBuilder responseStatusCode(int responseStatusCode) {
            this.responseStatusCode = responseStatusCode;
            return this;
        }

        @Generated
        public WebResponseBuilder responseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
            return this;
        }

        @Generated
        public WebResponseBuilder responseValue(Object responseValue) {
            this.responseValue = responseValue;
            return this;
        }

        @Generated
        public WebResponseBuilder errorDetails(ErrorDetails errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        @Generated
        public WebResponse build() {
            return new WebResponse(this.responseStatusCode, this.responseMessage, this.responseValue, this.errorDetails);
        }

        public WebResponseBuilder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public String toString() {
            return "WebResponse.WebResponseBuilder(responseStatusCode=" + this.responseStatusCode + ", responseMessage=" + this.responseMessage + ", responseValue=" + this.responseValue + ", errorDetails=" + this.errorDetails + ", statusCode=" + this.statusCode + ")";
        }
    }
}
