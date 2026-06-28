package com.sneakerhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneakerhub.repository.CartItemRepository;

@Service
public class CartItemService {
	
	@Autowired
	private CartItemRepository cartItemRepository;

}
