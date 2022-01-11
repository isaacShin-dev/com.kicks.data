package com.kkicks.data.userAccount;

import javax.transaction.Transactional;

import com.kkicks.data.core.domain.UserAccount;

public class UserAccountServiceImpl implements UserAccountService {

    private UserAccountRepository repo ;
    

    @Override
    @Transactional
    public UserAccount joinMember(UserAccount reqAccount) {
         return repo.save(reqAccount);        
    }
    
}
