package com.ust.securityh2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.securityh2.repo.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<MyUser> user= repository.findByUsername(username);
		if(user.isPresent()){
			return loadUserByUsername(username);
		}
		else {
			throw new UsernameNotFoundException(username);
		}
			
	}
	

}
