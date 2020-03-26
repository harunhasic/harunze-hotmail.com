package guru.springframework.privateclinic.bootstrap;

import guru.springframework.privateclinic.model.Doctor;
import guru.springframework.privateclinic.model.Patient;
import guru.springframework.privateclinic.services.DoctorService;
import guru.springframework.privateclinic.services.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {


    private final DoctorService doctorService;
    private final PatientService patientService;

    public DataLoader(DoctorService doctorService, PatientService patientService, DoctorService doctorService1, PatientService patientService1) {

        this.doctorService = doctorService1;
        this.patientService = patientService1;
    }

    @Override
    public void run(String... args) throws Exception {
        Doctor doctor1 = new Doctor();
        doctor1.setId(1L);
        doctor1.setFirstName("Harun");
        doctor1.setLastName("Hasic");

        doctorService.save(doctor1);

        Doctor doctor2 = new Doctor();
        doctor1.setId(2L);
        doctor1.setFirstName("Amel");
        doctor1.setLastName("Becic");

        doctorService.save(doctor2);

        System.out.println("Doctors loaded....");

        Patient patient1 = new Patient();

        patient1.setAdress("Vojvodica put 3");
        patient1.setCity("Zenica");
        patient1.setFirstName("Haris");
        patient1.setLastName("Hibic");

        patientService.save(patient1);

        Patient patient2 = new Patient();
        patient2.setAdress("Bullllllllllllevar");
        patient2.setCity("Zenica");
        patient2.setFirstName("Dino");
        patient2.setLastName("Sisic");

        patientService.save(patient2);

        System.out.println("Patients loaded....");

    }
}
