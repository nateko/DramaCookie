package com.nexyliya.dramacookie.services;

import java.util.List;

import com.nexyliya.dramacookie.dtos.UserDto;

public interface UserServiceI {

	public long count();
	public void delete(UserDto user);
	public void deleteById(Long userId);
	public boolean existsById(Long userId);
	public List<UserDto> findAll();
	public UserDto findById(Long userId);
	public void saveUser(UserDto user);
	
}
