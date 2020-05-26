package com.clinic.privateclinicius.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.print.Doc;


@Entity
public class Doctor extends Staff {
    @Id
    @GeneratedValue
    private Long id;
    private String specialty;
    private String username;
    private String password;


    public Doctor(String specialty) {
        super();
        this.specialty = specialty;
    }
    public Doctor(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
