package com.kkicks.data.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.checkerframework.checker.units.qual.C;
import org.hibernate.type.TrueFalseType;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)    
    private Long pId;

    @Column(length = 1600,updatable = true,nullable = true)
    private String imgUrl1;

    @Column(length = 1600,updatable = true,nullable = true)
    private String imgUrl2;
    
    @Column(length = 1600,updatable = true,nullable = true)
    private String imgUrl3;

    @Column(length = 800, nullable= false, updatable = true)
    private String productName; 

    @Column(nullable = false,updatable = true)
    private String maker;

    @Column(nullable = false, updatable = true)
    private String dropDate ; 

    @Column(nullable = false, updatable = true)
    private int price;

    private int likeCnt;

    @Column(nullable = false, updatable = false)
    private String userId ; // user id which who registered the info. 


}
