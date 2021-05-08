package com.tidynote.service;

import com.tidynote.entity.User;

public interface UserService {

	public User getUserProfile(String userId);
	
	public User addUser(User user);
}
