package com.kkicks.data.userAccount;

import java.util.UUID;

import com.kkicks.data.core.domain.UserAccount;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// handles requests regarding userAccount /infos
@Controller
@RequestMapping("/user")
public class UserAccountController {
    
    private UserAccountService userAccountService;

    ///////////////////////////
    //Member Join 
    ///////////////////////////
    @RequestMapping(value = "/join")
    public ResponseEntity<?> memberJoin(UserAccount reqAccount){
 

        UserAccount newUser = userAccountService.joinMember(reqAccount);

        return ResponseEntity.ok().body(newUser);
    }
    
    ///////////////////////////
    //User Info  
    ///////////////////////////
    @RequestMapping("/{userId}")
    public ResponseEntity<?> userInfo(@PathVariable("userId") UUID userId){

        return null; 
    }

}
