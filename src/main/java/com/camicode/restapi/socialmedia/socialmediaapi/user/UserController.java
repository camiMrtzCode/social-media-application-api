package com.camicode.restapi.socialmedia.socialmediaapi.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private UserDaoService daoService;
	
	public UserController(UserDaoService daoService) {
		this.daoService = daoService;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return daoService.findAll();
	}
	
	@GetMapping("/users/{userId}")
	public User retrieveUser(@PathVariable Integer userId) {
		return daoService.findOne(userId);
	}
}
