package com.imcs.dao;

import com.imcs.model.UserBean;

public class UserDAO {
	
	
	
	public UserBean getUser(String userName) {
		
		UserBean user= new UserBean();
		
		user.setUserID(123);
		user.setUserName(userName);
		
		return user;
	}

}
