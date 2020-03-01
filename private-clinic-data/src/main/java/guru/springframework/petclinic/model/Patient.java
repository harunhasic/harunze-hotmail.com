package guru.springframework.petclinic.model;

import java.time.LocalDate;


public class Patient {
    private String adress;
    private String city;
    private String telephone;
    private LocalDate birthDate;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private PatientType patientType;



    public PatientType getPatientType() {
        return patientType;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
