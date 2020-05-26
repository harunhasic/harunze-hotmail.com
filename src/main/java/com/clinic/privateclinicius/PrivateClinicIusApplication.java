package com.clinic.privateclinicius;

import com.clinic.privateclinicius.api.DoctorController;
import com.clinic.privateclinicius.model.Doctor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class PrivateClinicIusApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrivateClinicIusApplication.class, args);


        Doctor doctor = new Doctor();
        doctor.setName("Harun");
        doctor.setGender("male");
        doctor.setEducation("IUS");
        doctor.setPhone("062679679");
        doctor.setSpecialty("hirrurgg");
        DoctorController doctorController = new DoctorController();
        doctorController.create(doctor);
    }





}
