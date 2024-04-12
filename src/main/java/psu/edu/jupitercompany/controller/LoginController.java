package psu.edu.jupitercompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    //add request mapping
    @GetMapping("/access-denied")
    public String showAccessDeneied() {
        return "access-denied";
    }
    
}