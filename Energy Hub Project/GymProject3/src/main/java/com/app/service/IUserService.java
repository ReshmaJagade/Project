package com.app.service;

import com.app.pojos.User;
import com.app.pojos.UserRole;

public interface IUserService {
	// add a method for user validation
	User validateUser(String username, String pass);
	
	//add a method to add user
	User addUser(User u);

    //add a method to delete a user
	String deleteUser(String username);
   
}
