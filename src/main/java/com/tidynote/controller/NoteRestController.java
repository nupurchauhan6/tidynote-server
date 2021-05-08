package com.tidynote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tidynote.entity.Note;
import com.tidynote.service.NoteService;

@RestController
@RequestMapping("/api/notes")
public class NoteRestController {

	@Autowired
	private NoteService noteService;
	
	@GetMapping("/home")
	public String getHomePage() {
		return "This is a home page";
	}
	
	@GetMapping("/getAll/{userId}")
	public List<Note> getNotes(@PathVariable String userId) {
		return noteService.getAllNotes(userId);
	}
	
	@PostMapping("/addNote")
	public Note addNote(@RequestBody Note newNote) {
		return noteService.addNote(newNote);
	}
}
