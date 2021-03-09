package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Long>{
	
	User findByUsername(String username);

}
