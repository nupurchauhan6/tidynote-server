package com.tidynote.service;

import java.util.List;

import com.tidynote.entity.Note;

public interface NoteService {

	public List<Note> getAllNotes();
	
	public Note addNote(Note note);
}
