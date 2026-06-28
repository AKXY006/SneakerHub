package com.sneakerhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

}
