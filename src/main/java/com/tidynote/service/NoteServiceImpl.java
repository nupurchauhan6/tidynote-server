package com.tidynote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tidynote.entity.Note;
import com.tidynote.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteRepository noteRepository;
	
	@Override
	@Transactional
	public List<Note> getAllNotes(String userId) {
		return noteRepository.getAllNotes(userId);
	}

	@Override
	@Transactional
	public Note addNote(Note note) {
		return noteRepository.addNote(note);
	}

	@Override
	@Transactional
	public Note deleteNote(Note note) {
		return noteRepository.deleteNote(note);
	}

}
