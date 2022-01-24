package com.kkicks.data.userAccount;

import com.kkicks.data.core.domain.UserAccount;

import org.springframework.stereotype.Service;


public interface UserAccountService {

    UserAccount joinMember(UserAccount reqAccount);
    
}
