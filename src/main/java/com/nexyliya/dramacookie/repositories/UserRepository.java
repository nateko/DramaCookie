package com.nexyliya.dramacookie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexyliya.dramacookie.entities.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

