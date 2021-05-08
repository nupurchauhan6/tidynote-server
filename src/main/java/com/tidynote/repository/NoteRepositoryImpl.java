package com.tidynote.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tidynote.entity.Note;

@Repository
public class NoteRepositoryImpl implements NoteRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Note> getAllNotes(String userId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query theQuery = currentSession.createQuery("from Note N where N.userId = :user_id", Note.class);
		theQuery.setParameter("user_id",userId);
		
		// execute query and get result list
		List<Note> notes = theQuery.getResultList();

		// return the results
		return notes;
	}

	@Override
	public Note addNote(Note note) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(note);
		return note;
	}

	@Override
	public Note deleteNote(Note note) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.delete(note);
		return note;
	}

}
