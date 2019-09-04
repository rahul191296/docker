package com.cognizant.daoImpl;

import java.io.Console;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cognizant.entity.AdminEntity;
import com.cognizant.interfac.AdminDao;
import com.cognizant.model.AdminModel;



@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager manager;

	@Transactional
	@Override
	public boolean blockUser(int userId) {
		int userStatus = 0;
		 
		Query query = manager.createNativeQuery("update  Users_Table set user_Status=:userStatus where user_Id=:userId");
		query.setParameter("userStatus", "Block");
		query.setParameter("userId", userId);
		userStatus = query.executeUpdate();
		
		if(userStatus == 1) 
	    return true;
	  	else
			return false;
	}

	@Transactional
	@Override
	public boolean UnblockUser(int userId) {
		
		int userStatus = 0;
		Query query = manager.createNativeQuery("update  Users_Table set user_Status=:userStatus where user_Id=:userId");
		query.setParameter("userStatus", "Unblock");
		query.setParameter("userId", userId);
		userStatus = query.executeUpdate();
		if(userStatus == 1) 
		    return true;
		else
			return false;
	}

	@Transactional
	@Override
	public boolean blockMentor(int mentorId) {
		
		int mentorStatus = 0;
		Query query = manager.createNativeQuery("update  Mentor_Table set mentor_Status=:mentorStatus where mentor_Id=:mentorId");
		query.setParameter("mentorStatus", "Block");
		query.setParameter("mentorId", mentorId);
		mentorStatus = query.executeUpdate();
		if(mentorStatus == 1) 
		    return true;
		else
			return false;
	}

	@Transactional
	@Override
	public boolean UnblockMentor(int mentorId) {
		
		int mentorStatus = 0;
		Query query = manager.createNativeQuery("update  Mentor_Table set mentor_Status=:mentorStatus where mentor_Id=:mentorId");
		query.setParameter("mentorStatus", "Unblock");
		query.setParameter("mentorId", mentorId);
		mentorStatus = query.executeUpdate();
		if(mentorStatus == 1) 
		    return true;
		else
			return false;
	}

	@Override
	public boolean validateAdmin(AdminEntity adminEntity) {
		Query query=manager.createQuery("from AdminEntity a where a.userName=:userName And a.password=:password");
		query.setParameter("userName",adminEntity.getUserName());
		query.setParameter("password",adminEntity.getPassword());
		List<AdminEntity> validAdmin = query.getResultList();
		if(validAdmin.isEmpty())
			return false;
		else
		return true;
	}

	
}
