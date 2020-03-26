package guru.springframework.privateclinic.services.map;

import guru.springframework.privateclinic.model.Doctor;
import guru.springframework.privateclinic.services.DoctorService;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class DoctorServiceMap extends AbstractMapService<Doctor, Long> implements DoctorService {
    @Override
    public Set<Doctor> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Doctor object) {
        super.delete(object);
    }

    @Override
    public Doctor save(Doctor object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Doctor findById(Long id) {
        return super.findById(id);
    }
}


