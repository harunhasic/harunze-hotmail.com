package com.clinic.privateclinicius.api;

import com.clinic.privateclinicius.model.Patient;
import com.clinic.privateclinicius.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.security.Principal;
import java.util.List;

public class PatientController {
    private PatientRepository patientRepository;

    @Autowired
    public void setProductService( PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }



    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<Patient> create(@RequestBody Patient patient){

        Patient saved = patientRepository.save(patient);
        URI uri = URI.create("Http://locsalhost:8080/api/patients" + saved.getId());
        return ResponseEntity.created(uri).body(saved);
    }
    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<Patient>> getAll(){
        List<Patient> patientsList = patientRepository.findAll();
        return ResponseEntity.ok().body(patientsList);
    }
    @GetMapping(value = "/id",produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<Long> getPatientIdByUsername(Principal principal){
        Long patientId = patientRepository.findIdByPatientName(principal.getName());
        return ResponseEntity.ok().body(patientId);
    }
}
