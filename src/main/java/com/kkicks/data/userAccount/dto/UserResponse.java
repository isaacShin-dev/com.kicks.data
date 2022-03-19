package com.kkicks.data.userAccount.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse {

    private String resultCode;
    private String resultMessage;
    private String comment; 

    /**
     * 
     * @param resultCode
     * @param resultMesssage
     * @return UserResponse
     */
    public static UserResponse createResponseMessage(String resultCode, String resultMesssage, String comment) {
        return UserResponse.builder().resultCode(resultCode).resultMessage(resultMesssage).comment(comment).build();

    }
    
}
