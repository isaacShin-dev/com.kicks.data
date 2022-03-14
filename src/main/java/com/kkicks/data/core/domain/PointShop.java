package com.kkicks.data.core.domain;

import javax.persistence.Entity;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@Setter(AccessLevel.PROTECTED)
@Getter
@ToString
public class PointShop extends Product {
    
    private String pointValue ;

}
