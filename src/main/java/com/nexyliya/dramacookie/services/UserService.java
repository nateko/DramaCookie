package com.nexyliya.dramacookie.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexyliya.dramacookie.converters.UserConverter;
import com.nexyliya.dramacookie.dtos.UserDto;
import com.nexyliya.dramacookie.entities.user.User;
import com.nexyliya.dramacookie.repositories.UserRepository;

@Service
public class UserService implements UserServiceI {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public long count() {
		return userRepository.count();
	}

	@Override
	public void delete(UserDto user) {
		userRepository.delete(UserConverter.dtoToEntity(user));
	}

	@Override
	public void deleteById(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public boolean existsById(Long userId) {
		return userRepository.existsById(userId);
	}

	@Override
	public List<UserDto> findAll() {
		return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public UserDto findById(Long userId) {
		return UserConverter.entityToDto(userRepository.getOne(userId));
	}

	@Override
	public void saveUser(UserDto user) {
		userRepository.save(UserConverter.dtoToEntity(user));
	}



}
