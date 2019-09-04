package com.cognizant.convertor;

import com.cognizant.entity.AdminEntity;
import com.cognizant.model.AdminModel;

public class AdminConvertor {

	AdminModel adminModel = null;
	AdminEntity admin = null;

	public AdminModel adminEntityToModel(AdminEntity admin) {
		adminModel = new AdminModel();
		adminModel.setAdminId(admin.getAdminId());
		adminModel.setPassword(admin.getPassword());
		adminModel.setUserName(admin.getUserName());
		return adminModel;

	}

	public AdminEntity adminModelToEntity(AdminModel adminModel) {

		admin = new AdminEntity();
		admin.setAdminId(adminModel.getAdminId());
		admin.setPassword(adminModel.getPassword());
		admin.setUserName(adminModel.getUserName());
		return admin;

	}

}
