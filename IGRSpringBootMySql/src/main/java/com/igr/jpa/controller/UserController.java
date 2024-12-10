package com.igr.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igr.jpa.entities.User;
import com.igr.jpa.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUser();

	}

	// in this method we are taking user to Optional because If User is not found or
	// null then it create NullPoiterException thats why we take
	// By using Optional, you make it explicit that the method might return an empty
	// result
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	public void updateUser(@PathVariable int id, @RequestBody User user) {

		userService.updateUser(id, user);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);

	}

}
