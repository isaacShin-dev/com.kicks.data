package com.kkicks.data.core.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.kkicks.data.common.UserType;

import org.hibernate.annotations.Comment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Builder
@ToString
@Table(name = "User_Account")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserAccount {
    
    
    //memeber enroll basic info. 
    
    
    @Id 
    @Column(name = "user_id")
    private String userId; 
    
    @Column(nullable = false, length = 15, updatable = false)
    private String name; 

    @Column(nullable = false, length = 20)
    private String pwd; 
    
    @Column(nullable = false, length = 11)
    private String phoneNumber; 
    
    @Column(nullable = true, length = 50)
    private String email; 
    
    @Column(nullable = false, length = 8)
    private String dateOfBirth;

    @Comment("user Point")
    private int point; // user Point 

    private String enrollDate; // date of join
    @Comment("last time user updated the pwd ")
    private String pwdUpdate; // last time user updated the pwd 

    @Comment("탈퇴여부")
    private boolean delYn; 

    @Enumerated(EnumType.STRING)
    @Comment("ADMIN : 관리자, REGULAR : 정회원, ASSOCIATE : 준회원")
    private UserType userType;


    public UserAccount(String userId, String name, String pwd, String phoneNumber, String email, String dateOfBirth,
            int point, String enrollDate, String pwdUpdate, boolean delYn, UserType userType) {
        this.userId = userId;
        this.name = name;
        this.pwd = pwd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.point = point;
        this.enrollDate = enrollDate;
        this.pwdUpdate = pwdUpdate;
        this.delYn = delYn;
        this.userType = userType;
    } 

    //identity verification columes.
    // private String di; 
    // private String ci;










}
