package com.java.techie.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.techie.order.entity.Order;
import com.java.techie.order.services.OrderServices;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
private OrderServices orderServices;
	
	@PostMapping("/bookorders")
	public Order bookorders(@RequestBody Order order) {
		return orderServices.saveorder(order);
	}
}
