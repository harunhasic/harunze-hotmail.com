package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Doctor;
import guru.springframework.petclinic.services.CrudService;


import java.util.Set;

public class DoctorServiceMap extends AbstractMapService<Doctor, Long> implements CrudService<Doctor, Long> {
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


