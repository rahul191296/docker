package com.cognizant.interfac;

import com.cognizant.model.AdminModel;

public interface AdminService {

	boolean blockUser(int userId);
	boolean UnblockUser(int userId);
	boolean blockMentor(int mentorId);
	boolean UnblockMentor(int mentorId);
	boolean getAdminLoginStatus(AdminModel adminModel);
	
	
}
