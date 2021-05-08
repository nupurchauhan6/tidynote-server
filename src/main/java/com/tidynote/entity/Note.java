package com.tidynote.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note_details")
public class Note {

	@Id
	@Column(name = "note_id")
	private String noteId;

	@Column(name = "title")
	private String title;

	@Column(name = "content")
	private String content;

	@Column(name = "created_date")
	private String createdDate;

	@Column(name = "updated_date")
	private String updatedDate;
	
	@Column(name = "user_id")
	private String userId;

	public Note() {

	}

	public Note(String noteId, String title, String content, String createdDate, String updatedDate) {
		this.noteId = noteId;
		this.title = title;
		this.content = content;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public String getNoteId() {
		return noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
