package com.mj.librarymanagement.user.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mj.librarymanagement.user.entities.User;

@Service
public class UserService {
	private static List<User> usersList =Arrays.asList(new User(1, "1-name", "1-address"),new User(2,"2-name","2-address"));
	public User getUserById(int id) {

		for(User u :usersList) {
			if(u.getId()==id) {
				return u;
			}
		}
		
		return null;
	}
	
	public User addUser(User user) {
		if(usersList.add(user)) {
			return user;
		}
		return null;
	}

}
