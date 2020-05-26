package com.clinic.privateclinicius.model;

import java.util.Date;

public class Staff extends Person {

    private String education;
    private Date joined;

    public Staff(){
        super();

    }
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }
}
