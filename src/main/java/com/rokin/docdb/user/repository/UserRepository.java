package com.rokin.docdb.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rokin.docdb.user.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	public User findByName(String name);
}
