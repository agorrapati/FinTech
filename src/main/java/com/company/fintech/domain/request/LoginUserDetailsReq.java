package com.company.fintech.domain.request;

import com.company.fintech.base.SOAPBaseRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class LoginUserDetailsReq extends SOAPBaseRequest {

    public String username;
    public String password;

//    public LoginUserDetailsReq (String userName, String password){
//        this.userName = userName;
//        this.password = password;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        LoginUserDetailsReq that = (LoginUserDetailsReq) o;
//        return Objects.equals(userName, that.userName) && Objects.equals(password, that.password);
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof LoginUserDetailsReq;
//    }
//
//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        final Object $userName = this.getUserName();
//        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
//        return result;
//    }
//
//    public String toString() {
//        return "LoginUserDetailsReq(userId=" + this.getUserName() + ")";
//    }
//
//
//    public LoginUserDetailsReq (){
//
//    }
//    public static LoginUserDetailsReqBuilder builder(){
//        return new LoginUserDetailsReqBuilder();
//    }
//
//
//    public static class LoginUserDetailsReqBuilder{
//        public String userName;
//        public String password;
//
//        LoginUserDetailsReqBuilder(){
//
//        }
//        public LoginUserDetailsReqBuilder userName(String userName){
//            this.userName = userName;
//            return this;
//        }
//        public LoginUserDetailsReqBuilder password(String password){
//            this.password = password;
//            return  this;
//        }
//        public LoginUserDetailsReq build(){
//            return new LoginUserDetailsReq(userName,password);
//        }
//        public String toString(){
//            return "LoginUserDetailsReq.LoginUserDetailsReqBuilder(userId=" + this.userName + " password ="+password+")";
//
//        }

//    }

}
