package com.cognizant.interfac;

import com.cognizant.entity.AdminEntity;

public interface AdminDao {
	
	boolean blockUser(int userId);
	boolean UnblockUser(int userId);
	boolean blockMentor(int mentorId);
	boolean UnblockMentor(int mentorId);
	boolean validateAdmin(AdminEntity adminEntity);
	
}
