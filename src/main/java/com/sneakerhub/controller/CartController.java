package com.sneakerhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	

}
