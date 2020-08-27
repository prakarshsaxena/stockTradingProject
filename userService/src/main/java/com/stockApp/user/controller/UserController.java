package com.stockApp.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stockApp.user.service.UserService;
import com.stockApp.user.shared.Authentication;
import com.stockApp.user.shared.Credentials;

@RestController
@RequestMapping("/user")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/verify")
	public ResponseEntity <Authentication> findAll(@RequestBody Credentials credentials) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.verify(credentials));
	}
}
