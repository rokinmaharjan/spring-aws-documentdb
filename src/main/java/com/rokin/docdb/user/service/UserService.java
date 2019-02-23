package com.rokin.docdb.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rokin.docdb.user.model.User;
import com.rokin.docdb.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return this.userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

}
