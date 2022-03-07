package com.kkicks.data.userAccount;

import com.kkicks.data.core.domain.UserAccount;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserAccountService {

    private final UserAccountRepository repo ; 



    //////////////////////////////////////
    //Member Join 
    //@Date : 2022.01.25
    //@Tested.
    //////////////////////////////////////
    @Transactional
    public UserAccount joinMember(UserAccount reqAccount){
        
        UserAccount userCheck = repo.findById(reqAccount.getUserId()).map(m->m).orElse(null);
        
        if(userCheck == null){
            UserAccount newUser = repo.save(reqAccount);
            return newUser;
        }else{
            return null;
        }
    }



    //////////////////////////////////////
    //TODO:Member Delete
    //@Date : 2022.01.25
    //@Testing...
    //////////////////////////////////////
    public void memberQuit(){
        
    }



    //////////////////////////////////////
    //TODO:Member lookUp 
    //@Date : 2022.01.25
    //@Testing...
    //////////////////////////////////////
    public UserAccount memberLookUp(){
        return null;
    }



    //////////////////////////////////////
    //TODO:Member Modify
    //@Date : 2022.01.25
    //@Testing...
    //////////////////////////////////////
    public UserAccount memberModi(){
        return null;
    }
    
    
    
    //////////////////////////////////////
    //TODO:Member PK duplicate check 
    //@Date : 2022.03.08
    //@Testing...
    //////////////////////////////////////
    public Boolean findByUserId(String userId) {
        Boolean isDupId = false;
        UserAccount duplicateIdChecker = repo.findById(userId).map(m->m).orElse(null);

        if(duplicateIdChecker != null) isDupId = true;

        return isDupId;
    }
    
}

