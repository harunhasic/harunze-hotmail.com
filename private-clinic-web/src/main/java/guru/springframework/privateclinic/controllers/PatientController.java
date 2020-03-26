package guru.springframework.privateclinic.controllers;

import guru.springframework.privateclinic.services.DoctorService;
import guru.springframework.privateclinic.services.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/patients")
@Controller
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @RequestMapping({"/patients", "/patients/index", "patients/index.html"})
    private String listPatients(Model model){
        model.addAttribute("patients", patientService.findAll());

        return "patients/index";
    }
}
