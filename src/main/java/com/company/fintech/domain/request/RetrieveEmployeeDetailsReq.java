package com.company.fintech.domain.request;

import com.company.fintech.base.SOAPBaseRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetrieveEmployeeDetailsReq extends SOAPBaseRequest {

    private String userId;

    public RetrieveEmployeeDetailsReq(String userId) {
        this.userId = userId;
    }

    public RetrieveEmployeeDetailsReq() {
    }

    public static RetrieveEmployeeDetailsReqBuilder builder() {
        return new RetrieveEmployeeDetailsReqBuilder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RetrieveEmployeeDetailsReq)) return false;
        final RetrieveEmployeeDetailsReq other = (RetrieveEmployeeDetailsReq) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RetrieveEmployeeDetailsReq;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        return result;
    }

    public String toString() {
        return "RetrieveEmployeeDetailsReq(userId=" + this.getUserId() + ")";
    }

    public static class RetrieveEmployeeDetailsReqBuilder {
        private String userId;

        RetrieveEmployeeDetailsReqBuilder() {
        }

        public RetrieveEmployeeDetailsReqBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public RetrieveEmployeeDetailsReq build() {
            return new RetrieveEmployeeDetailsReq(this.userId);
        }

        public String toString() {
            return "RetrieveEmployeeDetailsReq.RetrieveEmployeeDetailsReqBuilder(userId=" + this.userId + ")";
        }
    }
}
