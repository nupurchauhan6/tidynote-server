package com.tidynote.repository;

import com.tidynote.entity.User;

public interface UserRepository {

	public User getUserProfile(String userId);

	public User addUser(User user);
}
