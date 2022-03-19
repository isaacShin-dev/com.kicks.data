package com.kkicks.data.userAccount;

import com.kkicks.data.common.Const;
import com.kkicks.data.core.domain.UserAccount;
import com.kkicks.data.userAccount.dto.UserResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserAccountService {

    private final UserAccountRepository repo ; 

/***
 * @apiNote Member Join service 
 * @param reqAccount
 * @return UserResponse
 */
    @Transactional
    public UserResponse joinMember(UserAccount reqAccount){
        UserAccount userCheck = repo.findById(reqAccount.getUserId()).map(m->m).orElse(null);
        if(userCheck != null){
            UserAccount newUser = repo.save(reqAccount);
            return UserResponse.createResponseMessage(
                                                        Const.STATUS_OK_CODE, 
                                                        Const.STATUS_OK_MESSAGE, 
                                                        "Member successfully registed !");
        }else{
            return UserResponse.createResponseMessage(
                                                        Const.STATUS_BAD_REQUEST_CODE, 
                                                        Const.STATUS_BAD_REQUEST_MESSAGE, 
                                                        "Member registration failed !"
                );
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

