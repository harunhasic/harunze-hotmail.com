package com.clinic.privateclinicius.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Patient extends Person{


    @Id
    @GeneratedValue
    private Long id;
    private String adress;
    private String city;
    private Integer age;
    private Date accepted;
    private String condition;

    public Patient(String adress, String city, Integer age, Date accepted, String condition) {
        super();
        this.adress = adress;
        this.city = city;
        this.age = age;
        this.accepted = accepted;
        this.condition = condition;
    }

    public Patient(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getAccepted() {
        return accepted;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
