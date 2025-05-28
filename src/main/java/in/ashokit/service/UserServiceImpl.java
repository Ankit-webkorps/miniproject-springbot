package in.ashokit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import in.ashokit.binding.LoginForm;
import in.ashokit.binding.SignUpForm;
import in.ashokit.binding.UnlockForm;
import in.ashokit.entity.UserDtlsEntity;
import in.ashokit.repo.UserDtlsRepo;
import in.ashokit.util.EmailUtils;
import in.ashokit.util.PwdUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDtlsRepo UserDtlsRepo;
	
	
	@Autowired
	private EmailUtils emailutils;
	
	@Override
	public String Login(LoginForm form) {
		
		return null;
	}

	@Override
	public boolean signup(SignUpForm form) {
		
		UserDtlsEntity entity=new UserDtlsEntity();
		BeanUtils.copyProperties(form,entity);
		
		String tempPwd=PwdUtils.generateRandomPwd();
		entity.setPwd(tempPwd);
		
		entity.setAccStatus("LOCKED");
		UserDtlsRepo.save(entity);
		String to = form.getEmail();
		String subject ="unlock your account ";
		StringBuffer body =new StringBuffer("");
		body.append("temporary pwd :"+ tempPwd);
		body.append("<br/>");
		body.append("<a href=\"http://localhost:8080/unlock?email="+to+"\">click here to unlock <a>");
		emailutils.sendEmails(to,subject,body.toString());
		
		return true;
	}

	@Override
	public boolean unlockAccount(UnlockForm form) {
		
		return false;
	}

	@Override
	public String forgotPwd(String email) {
				return null;
	}

}
