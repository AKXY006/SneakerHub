package com.sneakerhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.repository.OrderRepository;

@Service
public class OrderService {
    
	@Autowired	
	private OrderRepository orderRepository;
}
