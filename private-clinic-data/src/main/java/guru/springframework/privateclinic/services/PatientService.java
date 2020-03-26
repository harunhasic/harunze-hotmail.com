package guru.springframework.privateclinic.services;

import guru.springframework.privateclinic.model.Patient;

public interface PatientService extends CrudService<Patient, Long>{
    Patient findByLastName(String lastName);

}
