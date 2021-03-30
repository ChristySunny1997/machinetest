package com.faith.springboot.service;

import java.util.List;
import java.util.Optional;

import com.faith.springboot.entity.User;



public interface IUserService {
	
	//to get all user
	List<User> getAllUser();

	//to get the user by id
	Optional<User> getUserById(Integer id);

	//for adding new user
	void addUser(User user);

	//for updating user
	void updateUser(User user);

	//for deleteing existing user
	void deleteUser(Integer id);

}
