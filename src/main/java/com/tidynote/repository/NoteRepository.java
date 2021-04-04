package com.tidynote.repository;

import java.util.List;

import com.tidynote.entity.Note;

public interface NoteRepository {
	
	public List<Note> getAllNotes();
	
	public Note addNote(Note note);
}
