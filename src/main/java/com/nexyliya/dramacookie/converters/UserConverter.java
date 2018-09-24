package com.nexyliya.dramacookie.converters;

import com.nexyliya.dramacookie.dtos.UserDto;
import com.nexyliya.dramacookie.entities.User;

public class UserConverter {

	public static UserDto entityToDto(User user) {
		if(user == null) {
			return null;
		}
		
		UserDto userDto = new UserDto(user.getId(), user.getLogin(), user.getEmail(), user.getRole(), user.getIpAddress(), user.getStatus());
		userDto.setCreationDate(user.getCreationDate());
		userDto.setLastChangeDate(user.getLastAccessDate());
		userDto.setLastAccessDate(user.getLastAccessDate());
		userDto.setPassword(user.getPassword());
		return userDto;
	}
	
	public static User dtoToEntity(UserDto userDto) {
		if(userDto == null) {
			return null;
		}
		
		User user = new User(userDto.getLogin(), userDto.getEmail(), userDto.getPassword(), userDto.getRole(), userDto.getIpAddress(), userDto.getStatus());
		user.setCreationDate(userDto.getCreationDate());
		user.setLastAccessDate(userDto.getLastAccessDate());
		user.setLastChangeDate(userDto.getLastChangeDate());
		user.setPassword(userDto.getPassword());
		return user;
	}
}
