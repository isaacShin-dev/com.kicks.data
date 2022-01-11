package com.kkicks.data.core.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@Builder
@ToString
public class UserAccount {
    
    
    //memeber enroll basic info. 
    
    @Id @GeneratedValue
    private UUID userId;
    
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

    private String raffleInCnt ;

    private String point;


    private Date enrollDate; 
    private Date updDate;

    //identity verification columes.
    private String di; 
    private String ci;










}
