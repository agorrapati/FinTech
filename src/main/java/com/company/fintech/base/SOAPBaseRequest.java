package com.company.fintech.base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SOAPBaseRequest {
    private String initiatorId;
    private String originatorId;

    @Generated
    public String getInitiatorId() {
        return initiatorId;
    }
    @Generated
    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }
    @Generated
    public String getOriginatorId() {
        return originatorId;
    }
    @Generated
    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }
}
