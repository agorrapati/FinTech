package com.company.fintech.base;

import com.company.fintech.WebResponse.WebResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BaseController {
    public ResponseEntity<WebResponse> createSyncResponse(BaseResponse baseResponse){
        ResponseEntity<WebResponse> responseEntity;
        if(Objects.nonNull(baseResponse)){
            if(Objects.isNull(baseResponse.getErrorDetails())){
                responseEntity = this.createSyncSuccessResponse(baseResponse);
            }else{
                responseEntity = this.createSyncErrorResponse(baseResponse);
            }
        }else{
            responseEntity = this.createSyncFailedResponse();
        }
        return responseEntity;
    }

    private ResponseEntity<WebResponse> createSyncFailedResponse() {
        return this.createSyncFailedResponse((Object) null);
    }

    private ResponseEntity<WebResponse> createSyncFailedResponse(Object responseValue) {
        return ResponseEntity.ok(WebResponse.builder().responseStatusCode(1002).responseMessage("Failed due to internal error").responseValue(responseValue).build());
    }

    private ResponseEntity<WebResponse> createSyncErrorResponse(BaseResponse baseResponse) {
        return this.createSyncErrorResponse((Object) null);
    }

    private ResponseEntity<WebResponse> createSyncErrorResponse(Object responseValue) {
        return ResponseEntity.ok(WebResponse.builder().responseStatusCode(1002).responseMessage("Failed due to internal error").responseValue(responseValue).build());
    }

    private ResponseEntity<WebResponse> createSyncSuccessResponse(BaseResponse baseResponse) {
        return this.createSyncSuccessResponse((Object) null);
    }

    private ResponseEntity<WebResponse> createSyncSuccessResponse(Object responseValue) {
        return ResponseEntity.ok(WebResponse.builder().responseStatusCode(1000).responseMessage("Message processed successfully").responseValue(responseValue).build());
    }

}
