package psu.edu.jupitercompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/employees")
	public String showHome() {
		return "home";
	}
	@GetMapping("/login")
    public String login() {
        
		return "login";
    }
	
	@GetMapping("/access-denied")
	public String accessDenied() {
		
		return "access-denied";
	}
	@GetMapping("/")
	public String showLanding() {
		return "landing";
	}
}
