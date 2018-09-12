package com.nexyliya.dramacookie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexyliya.dramacookie.dtos.UserDto;
import com.nexyliya.dramacookie.services.UserService;

@RequestMapping("/users")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/{userId}")
	public UserDto getUserById(@PathVariable Long userId) {
		return userService.findById(userId);
	}

	@RequestMapping("/")
	public List < UserDto > getAllUsers() {
		return userService.findAll();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
	}

}
