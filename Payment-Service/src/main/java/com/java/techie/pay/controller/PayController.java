package com.java.techie.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.techie.pay.entity.Payment;
import com.java.techie.pay.services.PaymentServices;

@RestController
@RequestMapping("/payment")
public class PayController {

	@Autowired
	private PaymentServices paymentServices;
	
	@PostMapping("/dopPayment")
	public Payment  doPayment(Payment payment) {
		return paymentServices.doPayment(payment);
		
	}
}
