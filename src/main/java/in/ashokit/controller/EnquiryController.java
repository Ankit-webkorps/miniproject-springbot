package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnquiryController {

	@GetMapping("/dashboard")
	public String dashboardpage() {
		return "dashboard";
	}
	
	
	@GetMapping("/enquiry")
	public String addEnquirypage() {
		return "add-enquiry";
	}
	
	
	@GetMapping("/enquries")
	public String viewEnquiriespage() {
		return "view-enquiries";
	}
	
}
