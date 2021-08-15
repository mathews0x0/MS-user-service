package com.mj.librarymanagement.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.mj.librarymanagement.user.controllers","com.mj.librarymanagement.user.entities","com.mj.librarymanagement.user.service"})
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
