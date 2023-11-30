package com.alaa.loginregister.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alaa.loginregister.models.User;

@Repository
public interface UserReposiotry extends CrudRepository<User, Long> {
	
	// Find user by email
	Optional<User> findByEmail(String email);
}
