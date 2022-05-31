package com.java.techie.pay.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.techie.pay.entity.Payment;
import com.java.techie.pay.repo.PaymentRepo;

@Service
public class PaymentServices {

	@Autowired
	private PaymentRepo paymentRepo;
	
	public Payment doPayment (Payment payment) {
		payment.setTransationId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
}
