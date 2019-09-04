package com.cognizant.convertor;

import com.cognizant.entity.UserEntity;
import com.cognizant.model.UserModel;

public class UserConvertor {

	UserModel userModel = null;
	UserEntity user = null;

	public UserModel userEntityToModel(UserEntity user) {
		userModel = new UserModel();
		userModel.setUserId(user.getUserId());
		userModel.setPassword(user.getPassword());
		userModel.setName(user.getName());
		userModel.setEmail(user.getEmail());
		userModel.setContactNo(user.getContactNo());
		userModel.setDob(user.getDob());
		userModel.setUserStatus(user.getUserStatus());
		return userModel;

	}

	public UserEntity userModelToEntity(UserModel userModel) {

		user = new UserEntity();

		user.setUserId(userModel.getUserId());
		user.setPassword(userModel.getPassword());
		user.setName(userModel.getName());
		user.setEmail(userModel.getEmail());
		user.setContactNo(userModel.getContactNo());
		user.setDob(userModel.getDob());
		user.setUserStatus(userModel.getUserStatus());
		return user;

	}
}
