package com.nexyliya.dramacookie.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nexyliya.dramacookie.entities.user.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

