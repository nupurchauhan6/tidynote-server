package com.tidynote.controller;

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
import com.tidynote.entity.User;
import com.tidynote.service.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/getUserProfile/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUserProfile(@PathVariable String userId) {
		return new ResponseEntity<User>(userService.getUserProfile(userId), HttpStatus.OK);
	}

	@PostMapping(path = "/addUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addUser(@RequestBody User user) {
		try {
			return new ResponseEntity<User>(userService.addUser(user), HttpStatus.OK);
		} catch (Exception exe) {
			return null;
		}
	}

}
