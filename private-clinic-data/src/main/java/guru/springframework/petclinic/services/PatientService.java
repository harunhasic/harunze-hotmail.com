package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Patient;

import java.util.Set;

public interface PatientService extends CrudService<Patient, Long>{
    Patient findByLastName(String lastName);

}
