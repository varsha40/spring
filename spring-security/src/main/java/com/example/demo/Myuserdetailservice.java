package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class Myuserdetailservice implements UserDetailsService {
	@Autowired
	private Userrepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("user not found");
		else {
			return new Userprincipal(user);
	}
	}
} 
