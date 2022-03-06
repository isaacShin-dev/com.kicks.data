package com.kkicks.data.userAccount;

import java.util.UUID;

import com.kkicks.data.core.domain.UserAccount;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// handles requests regarding userAccount /infos
@Controller

public class UserAccountController {
    
    private UserAccountService userAccountService;

    ///////////////////////////
    //Member Join 
    ///////////////////////////
    @RequestMapping(value = "user/join")
    public ResponseEntity<?> memberJoin(UserAccount reqAccount){
        
        
        UserAccount newUser = userAccountService.joinMember(reqAccount);
        
        return ResponseEntity.ok().body(newUser);
    }
    @GetMapping("/join")
    public String joinPage(){
        return "user/join";
    }

    ///////////////////////////
    //Member Join 
    ///////////////////////////
    @GetMapping("/login")
    public String userLogin(){
        return "user/login";
    }
    ///////////////////////////
    //User Info  
    ///////////////////////////
    @RequestMapping("user/{userId}")
    public ResponseEntity<?> userInfo(@PathVariable("userId") UUID userId){

        return null; 
    }

}
