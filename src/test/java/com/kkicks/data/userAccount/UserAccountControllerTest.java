package com.kkicks.data.userAccount;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.kkicks.data.common.UserType;
import com.kkicks.data.core.domain.UserAccount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import groovy.util.logging.Slf4j;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Slf4j
public class UserAccountControllerTest {


    private @Autowired UserAccountService service;

    @Test
    @DisplayName("User join Unit test")
    void userJoin() throws Exception{

        String now = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        
        UserAccount user = new UserAccount("Tester1", "홍길동", "1234", "01086353569", "test123@gmail.com",
                                            "19920521", 0, now, now, false, UserType.ADMIN);

        UserAccount joinMember = service.joinMember(user);

        Assertions.assertThat(joinMember.getUserId().equals(user.getUserId()));

    }


}
