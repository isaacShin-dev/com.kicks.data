package com.kkicks.data.userAccount;

import java.util.UUID;

import com.kkicks.data.core.domain.UserAccount;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// handles requests regarding userAccount /infos
@RestController
@RequestMapping("/user")
public class UserAccountController {
    
    private UserAccountService userAccountService;

    ///////////////////////////
    //Member Join 
    ///////////////////////////
    @PostMapping("/join")
    public ResponseEntity<?> memberJoin(@RequestBody UserAccount reqAccount){
        if(reqAccount == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }else{
            return ResponseEntity.ok().body(userAccountService.joinMember(reqAccount));
        }        
    }
    
    ///////////////////////////
    //User Info  
    ///////////////////////////
    @GetMapping("/{userId}")
    public ResponseEntity<?> userInfo(@PathVariable("userId") UUID userId){

        return null; 
    }

}
