package com.tidynote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tidynote.entity.User;
import com.tidynote.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public User getUserProfile(String userId) {
		return userRepository.getUserProfile(userId);
	}

	@Override
	@Transactional
	public User addUser(User user) {
		return userRepository.addUser(user);
	}

}
