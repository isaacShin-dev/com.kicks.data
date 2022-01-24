package com.kkicks.data.userAccount;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kkicks.data.common.UserType;
import com.kkicks.data.core.domain.UserAccount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import groovy.util.logging.Slf4j;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class UserAccountControllerTest {

    public @Autowired MockMvc mvc ;

    
    @Test
    @DisplayName("User join Unit test")
    void userJoin() throws Exception{

        String now = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        
        UserAccount user = new UserAccount("Tester1", "홍길동", "1234", "01086353569", "test123@gmail.com",
                                            "19920521", 0, now, now, false, UserType.ADMIN);

        ObjectMapper mapper = new ObjectMapper();

        String userStr = mapper.writeValueAsString(user);
        mvc.perform(MockMvcRequestBuilders.post("/user/join")
        .content(userStr)
        .contentType(MediaType.APPLICATION_JSON))
        .andDo(MockMvcResultHandlers.print())
        .andExpect(MockMvcResultMatchers.status().isOk());
    }


}
