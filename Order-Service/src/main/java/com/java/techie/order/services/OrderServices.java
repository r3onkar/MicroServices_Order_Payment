package com.java.techie.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.java.techie.order.entity.Order;
import com.java.techie.order.repo.OrderRepo;

@Service
public class OrderServices {

	
	@Autowired
	private OrderRepo orderrepo;
	
	
	public Order saveorder (Order order) {
		return orderrepo.save( order);
	}
}
