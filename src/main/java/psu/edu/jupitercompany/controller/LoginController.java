package psu.edu.jupitercompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	@GetMapping("/login")
    public String login() {
        
		return "login";
    }
}