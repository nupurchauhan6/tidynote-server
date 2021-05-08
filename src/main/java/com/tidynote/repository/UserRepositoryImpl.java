package com.tidynote.repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tidynote.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	public User getUserProfile(String userId) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(User.class, userId);
	}

	@Override
	public User addUser(User user) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(user);
		return currentSession.get(User.class, user.getUserId());
	}

}
