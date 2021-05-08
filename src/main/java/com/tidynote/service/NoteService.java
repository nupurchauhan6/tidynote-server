package com.tidynote.service;

import java.util.List;

import com.tidynote.entity.Note;

public interface NoteService {

	public List<Note> getAllNotes(String userId);
	
	public Note addNote(Note note);
	
	public Note deleteNote(Note note);
}
