package com.example.hospital;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.ui.Model;

@Controller
public class HospitalController {
    @GetMapping("/hospital")
    public String index() {
        return "cadastrarPaciente";
    }
}


