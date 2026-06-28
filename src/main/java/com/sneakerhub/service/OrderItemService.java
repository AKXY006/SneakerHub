package com.sneakerhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.repository.OrderItemRepository;

@Service
public class OrderItemService {
   
	@Autowired
	private OrderItemRepository orderItemRepository;
}
