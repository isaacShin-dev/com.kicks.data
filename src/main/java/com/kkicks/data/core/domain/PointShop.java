package com.kkicks.data.core.domain;

import javax.persistence.Entity;

import groovy.transform.ToString;
import groovy.transform.builder.Builder;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Setter(AccessLevel.PROTECTED)
@Getter
@ToString
public class PointShop extends Product {
    

    


}
