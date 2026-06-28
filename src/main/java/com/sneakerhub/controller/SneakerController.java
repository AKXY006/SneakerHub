package com.sneakerhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.service.SneakerService;

@RestController
public class SneakerController {
	
	@Autowired
	private SneakerService sneakerService;
	

}
