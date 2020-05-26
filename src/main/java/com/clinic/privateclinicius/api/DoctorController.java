package com.clinic.privateclinicius.api;

import com.clinic.privateclinicius.model.Doctor;
import com.clinic.privateclinicius.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="api/doctor",produces = MediaType.APPLICATION_JSON)
public class DoctorController {
    private DoctorRepository doctorRepository;

    @Autowired
    public void setProductService( DoctorRepository doctorRepository){
        this.doctorRepository=doctorRepository;
    }



    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<Doctor> create(@RequestBody Doctor doctor){

        Doctor saved = doctorRepository.save(doctor);
        URI uri = URI.create("http://locsalhost:8080/api/doctor" + saved.getId());
        return ResponseEntity.created(uri).body(saved);
    }
    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<Doctor>> getAll(){
        List<Doctor> doctorList = doctorRepository.findAll();
        return ResponseEntity.ok().body(doctorList);
    }
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<Doctor> getById(@PathVariable Long id){
        Doctor doctor = doctorRepository.findById(id).get();
        return ResponseEntity.ok().body(doctor);
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<Doctor>  updateDoctor(@RequestBody Doctor doctor,@PathVariable Long id){


        Doctor doctorDB = doctorRepository.findById(id).get();
        if (doctorDB == null) {
            return ResponseEntity.notFound().build();
        }
        doctorDB.setName(doctor.getName());
        doctorDB.setSpecialty(doctor.getSpecialty());
        doctorDB.setPhone(doctor.getPhone());
        doctorDB.setEducation(doctor.getEducation());
        doctorDB.setJoined(doctor.getJoined());
        doctorDB.setGender(doctor.getGender());

        doctorRepository.save(doctorDB);

        return ResponseEntity.ok().body(doctorDB);
    }
    @DeleteMapping (value = "/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity deleteById(@PathVariable Long id){
        doctorRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
