package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.interfac.AdminService;
import com.cognizant.model.AdminModel;
import com.cognizant.validator.AdminLoginValidator;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AdminLoginValidator loginValidator;

	@GetMapping("/adminRegister")
	public String register() {
		return "hello";

	}
	
	@GetMapping("/adminLoginCheck")
	public ResponseEntity<Void> doAdminLogin(@RequestBody AdminModel adminModel,Errors errors) {
		ResponseEntity<Void> response = null;
		ValidationUtils.invokeValidator(loginValidator,adminModel,errors);
		if(errors.hasErrors()){
			response=new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else{                                                                                                                                               
			//HttpSession session=request.getSession(true);
			response=new ResponseEntity<Void>(HttpStatus.FOUND);
		}
		return response;
	}
	
	@GetMapping("/blockUser/{userId}")
	public ResponseEntity<Void> blockUser(@PathVariable("userId")int userId) {
		ResponseEntity<Void> response = null;

		boolean userStatus = adminService.blockUser(userId);
		
		if(userStatus == true)
			response=new ResponseEntity<Void>(HttpStatus.ACCEPTED);	
		else
			response=new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		return response;
		
	}

	@GetMapping("/unblockUser/{userId}")
	public ResponseEntity<Void> unblockUser(@PathVariable("userId")int userId) {
		ResponseEntity<Void> response = null;

		boolean userStatus = adminService.UnblockUser(userId);
		
		if(userStatus == true)
			response=new ResponseEntity<Void>(HttpStatus.ACCEPTED);	
		else
			response=new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		return response;
		
	}
	
	@GetMapping("/blockMentor/{mentorId}")
	public ResponseEntity<Void> blockMentor(@PathVariable("mentorId")int mentorId) {
		ResponseEntity<Void> response = null;

		boolean mentorStatus = adminService.blockMentor(mentorId);
		
		if(mentorStatus == true)
			response=new ResponseEntity<Void>(HttpStatus.ACCEPTED);	
		else
			response=new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		return response;
	}
	
	@GetMapping("/unblockMentor/{mentorId}")
	public ResponseEntity<Void> unblockMentor(@PathVariable("mentorId")int mentorId) {
		ResponseEntity<Void> response = null;

		boolean mentorStatus = adminService.UnblockMentor(mentorId);
		
		if(mentorStatus == true)
			response=new ResponseEntity<Void>(HttpStatus.ACCEPTED);	
		else
			response=new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		return response;
		
	}
	

}
