package com.clinic.privateclinicius.repository;

import com.clinic.privateclinicius.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    public List<Patient> findAll();
    @Query("SELECT id FROM Patient WHERE name=:name")
    Long findIdByPatientName(@Param("name")String name);



}
