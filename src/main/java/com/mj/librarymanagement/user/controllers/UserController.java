package com.mj.librarymanagement.user.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mj.librarymanagement.user.entities.User;
import com.mj.librarymanagement.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserService userService;
 
	@GetMapping("/{id}")
	private User getUser(@PathVariable(value = "id")String id) {
		return  userService.getUserById(Integer.valueOf(id));		
	}
	
	@PostMapping
	private User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
