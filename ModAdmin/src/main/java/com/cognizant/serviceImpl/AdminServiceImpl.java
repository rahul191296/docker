package com.cognizant.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.convertor.AdminConvertor;

import com.cognizant.entity.AdminEntity;
import com.cognizant.interfac.AdminDao;
import com.cognizant.interfac.AdminService;
import com.cognizant.model.AdminModel;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	AdminConvertor adminConvertor = new AdminConvertor();

	@Override
	public boolean blockUser(int userId) {
	
		return adminDao.blockUser(userId);
	}

	@Override
	public boolean UnblockUser(int userId) {
		
		return adminDao.UnblockUser(userId);
	}

	@Override
	public boolean blockMentor(int mentorId) {
	
		return adminDao.blockMentor(mentorId);
	}

	@Override
	public boolean UnblockMentor(int mentorId) {
		
		return adminDao.UnblockMentor(mentorId);
	}

	@Override
	public boolean getAdminLoginStatus(AdminModel adminModel) {
		AdminEntity adminEntity = adminConvertor.adminModelToEntity(adminModel);
		return adminDao.validateAdmin(adminEntity);
		
	}

	
}
