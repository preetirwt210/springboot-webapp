package com.web.springboot.springbootwebapp.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.web.springboot.springbootwebapp.model.User;
import com.web.springboot.springbootwebapp.repository.UserRepository;


@Service
@Transactional
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository theUserRepository) {
		userRepository=theUserRepository;
	}

	public void saveMyUser(User user) {
		userRepository.save(user);
	}
}
