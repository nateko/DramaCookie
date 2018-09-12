package com.nexyliya.dramacookie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexyliya.dramacookie.entities.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

