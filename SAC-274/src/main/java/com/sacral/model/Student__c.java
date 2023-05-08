package com.sacral.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student__c { 
    
    @Id
    private Long id;
    
    private String mobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}