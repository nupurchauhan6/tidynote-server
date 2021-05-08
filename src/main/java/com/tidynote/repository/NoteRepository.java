package com.tidynote.repository;

import java.util.List;

import com.tidynote.entity.Note;

public interface NoteRepository {
	
	public List<Note> getAllNotes(String userId);
	
	public Note addNote(Note note);
	
	public Note deleteNote(Note note);
}
