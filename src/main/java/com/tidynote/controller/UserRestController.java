package com.tidynote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
      
import com.tidynote.entity.User;
import com.tidynote.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/getUserProfile/{userId}")
	public User getUserProfile(@PathVariable String userId) {
		return userService.getUserProfile(userId);
	}

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		try {
			return userService.addUser(user);
		} catch (Exception exe) {
			return null;
		}
	}

}
