package com.cognizant.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.interfac.AdminService;
import com.cognizant.model.AdminModel;

@Component("LoginValidator")
public class AdminLoginValidator implements Validator {

	@Autowired
	private AdminService adminService;
		
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(AdminModel.class);
		
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		AdminModel adminModel=(AdminModel)arg0;
		boolean loginResult=adminService.getAdminLoginStatus(adminModel);
		if(loginResult==false)
		{
			arg1.rejectValue("adminId","com.cognizant.controller.wrongUserName");
			arg1.rejectValue("password","com.cognizant.controller.wrongPassword");			
		}
	}

}
