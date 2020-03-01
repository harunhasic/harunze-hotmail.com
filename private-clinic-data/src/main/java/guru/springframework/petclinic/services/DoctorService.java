package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Doctor;
import guru.springframework.petclinic.model.Patient;

import java.util.Set;

public interface DoctorService {
    Doctor findById(Long id);
    Doctor save(Doctor doctor);
    Set<Doctor> findAll();
}
