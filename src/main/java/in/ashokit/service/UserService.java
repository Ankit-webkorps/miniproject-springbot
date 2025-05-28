package in.ashokit.service;

import in.ashokit.binding.LoginForm;
import in.ashokit.binding.SignUpForm;
import in.ashokit.binding.UnlockForm;

public interface UserService {
 
	public String Login(LoginForm form);
	public boolean signup(SignUpForm form);
	public boolean unlockAccount(UnlockForm form);
	public String forgotPwd(String email);
	
	
}
