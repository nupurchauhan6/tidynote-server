package com.tidynote.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tidynote.entity.Note;
import com.tidynote.service.NoteService;

@RestController
@RequestMapping(path = "/api/notes")
public class NoteRestController {

	@Autowired
	private NoteService noteService;
	
	@GetMapping(path = "/getAll/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Note>> getNotes(@PathVariable String userId) {
		return new ResponseEntity<List<Note>>(noteService.getAllNotes(userId), HttpStatus.OK);
	}
	
	@PostMapping(path = "/addNote", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Note> addNote(@RequestBody Note newNote) {
		return new ResponseEntity<Note>(noteService.addNote(newNote), HttpStatus.OK);
	}
}
