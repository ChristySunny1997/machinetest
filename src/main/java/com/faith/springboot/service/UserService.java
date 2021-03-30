package com.faith.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.springboot.entity.User;
import com.faith.springboot.repo.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	// implementing the methods
	@Override
	public List<User> getAllUser() {

		return (List<User>) userRepository.findAll();
	}

	// get the list of user
	@Override
	public Optional<User> getUserById(Integer id) {

		return userRepository.findById(id);
	}

	// to add the user
	@Override
	public void addUser(User user) {

		userRepository.save(user);
	}

	// to update the existing user
	@Override
	public void updateUser(User user) {

		userRepository.save(user);
	}

	// to delete the user
	@Override
	public void deleteUser(Integer id) {

		userRepository.deleteById(id);

	}

	//checking user name and password
	public User findUserByNameAndPassword(String userName, String password) {
		User user = userRepository.findByUsernameAndPassword(userName, password);
		if (userName.equals(user.getUserName()) && password.equals(user.getPassWord())) {
			return user;
		} else {
			return null;
		}
	}

}
