package com.kkicks.data.core.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@ToString
public class UserAccount {
    
    
    //memeber enroll basic info. 
    
    @Id @GeneratedValue
    private UUID id;
    
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

    //identity verification columes.
    private String di; 
    private String ci;



    public UserAccount(UUID id, String name, String pwd, String phoneNumber, String email, String di, String ci) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.di = di;
        this.ci = ci;
    } 




}
