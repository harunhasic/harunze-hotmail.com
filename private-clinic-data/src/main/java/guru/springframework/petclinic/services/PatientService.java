package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Patient;

import java.util.Set;

public interface PatientService {
    Patient findByLastName(String lastName);
    Patient findById(Long id);
    Patient save(Patient patient);
    Set<Patient> findAll();

}
