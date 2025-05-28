package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.SignUpForm;
import in.ashokit.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/signup")
	private String handleSignUp(SignUpForm form,Model model)
   {
	   
	   boolean status =userService.signup(form);
	   if(status) {
		   
		   model.addAttribute("succMsg","check your mail");
		   
	   }
	   else {
		   model.addAttribute("errmsg","problem occured");
	   }
	   return "signup";
   }

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/signup")
	public String signUpPage(Model model) {
		model.addAttribute("user", new SignUpForm());
		return "signup";
	}

	@GetMapping("/unlock")
	public String unlockPage() {
		return "unlock";
	}

	@GetMapping("/forgot")
	public String forgotpwdPage() {
		return "forgotpwd";
	}
}
