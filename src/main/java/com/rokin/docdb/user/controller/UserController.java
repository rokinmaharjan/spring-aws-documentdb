package com.rokin.docdb.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rokin.docdb.user.model.User;
import com.rokin.docdb.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public User saveUser(@RequestBody @Valid User user) {
		return this.userService.saveUser(user);
	}

	@GetMapping()
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}

}
