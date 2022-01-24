package com.kkicks.data.userAccount;

import javax.transaction.Transactional;

import com.kkicks.data.core.domain.UserAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("UserAccountService")
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository repo ;
    

    @Override
    @Transactional
    public UserAccount joinMember(UserAccount reqAccount) {

        UserAccount userCheck = repo.findById(reqAccount.getUserId()).map(m->m).orElse(null);
        if(userCheck == null){
            return repo.save(reqAccount);         
        }else{
            return null; 
        }
    }
    
}
