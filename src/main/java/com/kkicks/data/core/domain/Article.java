package com.kkicks.data.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import groovy.transform.builder.Builder;
import lombok.Getter;

@Entity
@Getter
@Builder
public class Article {
    
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ArticleNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserAccount user;

    @Column(nullable = false,updatable = true,length = 200)
    private String title;

    @Column(columnDefinition="TEXT", nullable = false,updatable = true)
    private String article;

    //TODO: Comment 
}
