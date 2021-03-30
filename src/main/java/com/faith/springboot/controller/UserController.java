package com.faith.springboot.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.springboot.entity.User;
import com.faith.springboot.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private IUserService iUserService;
	
//	@GetMapping("user-login/{userName}&{password}")
//	// @GetMapping("users/{userName}")
//	public User findUserByNameAndPassword(@PathVariable String userName, @PathVariable String password) {
//	return iUserService.findUserByNameAndPassword(userName, password);
//	}

	// get all users
	@GetMapping("/users")
	public List<User> getAllUser() {
		return iUserService.getAllUser();
	}

	// get user by using id
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return iUserService.getUserById(id);

	}

	// add new user
	@PostMapping("/users/add")
	public void addUser(@RequestBody User user) {
		iUserService.addUser(user);
	}

	// update existing user
	@PutMapping("/users/{id}/update")
	public void updateUser(@RequestBody User user) {
		iUserService.updateUser(user);
	}

	// deleting the existing user
	@DeleteMapping("/users/{id}/delete")
	public void deleteUser(@PathVariable Integer id) {
		iUserService.deleteUser(id);
	}
}