package guru.springframework.privateclinic.services.map;

import guru.springframework.privateclinic.model.Patient;
import guru.springframework.privateclinic.services.PatientService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PatientServiceMap extends AbstractMapService<Patient, Long> implements PatientService {
    @Override
    public Set<Patient> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Patient object) {
        super.delete(object);

    }

    @Override
    public Patient save(Patient object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Patient findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Patient findByLastName(String lastName) {
        return null;
    }
}
