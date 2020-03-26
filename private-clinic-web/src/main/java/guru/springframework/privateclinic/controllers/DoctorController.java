package guru.springframework.privateclinic.controllers;


import guru.springframework.privateclinic.services.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/doctors")
@Controller
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }


    @RequestMapping({"/doctors", "/doctors/index", "doctors/index.html"})
    private String listDoctors(Model model){
        model.addAttribute("doctors", doctorService.findAll());

        return "templates/doctors/index";
    }
}
