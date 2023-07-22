package com.watch.store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.store.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	
	 //Customized Method 
	 Optional<User> findByEmail(String email);
	 public List<User>  findByNameContaining(String keyword);
}
