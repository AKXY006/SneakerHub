package com.sneakerhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sneakerhub.service.OrderItemService;

@RestController
public class OrderItemController {
	
	@Autowired
	private OrderItemService orderItemService;

}
