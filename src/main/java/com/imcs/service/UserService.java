package com.imcs.service;

import com.imcs.dao.UserDAO;
import com.imcs.model.UserBean;

public class UserService {
	
private UserDAO userDAO;
	
	public UserService(){
		userDAO = new UserDAO();
		
	}
	
	
	public UserBean lookUpUser(String userName) {
		
		return userDAO.getUser(userName);
	}

}
