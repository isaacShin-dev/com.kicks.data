package com.kkicks.data.userAccount;

import java.util.UUID;

import com.kkicks.data.common.Const;
import com.kkicks.data.core.domain.UserAccount;
import com.kkicks.data.userAccount.dto.UserResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// handles requests regarding userAccount /infos
@RestController
@RequestMapping("/user")
public class UserAccountController {

    private @Autowired UserAccountService userAccountService;

/***
 * @apiNote Member join 
 * @param reqAccount
 * @return ResponseEntity<UserResponse>
 */
    @RequestMapping(value = "/join")
    public ResponseEntity<?> memberJoin(UserAccount reqAccount){ return ResponseEntity.ok().body(userAccountService.joinMember(reqAccount));}

    ///////////////////////////
    //User Info 
    ///////////////////////////
    @RequestMapping("info/{userId}")
    public ResponseEntity<?> userInfo(@PathVariable("userId") UUID userId){
        
        return null; 
    }

}
