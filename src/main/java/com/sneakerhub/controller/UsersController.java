package com.sneakerhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	

}
