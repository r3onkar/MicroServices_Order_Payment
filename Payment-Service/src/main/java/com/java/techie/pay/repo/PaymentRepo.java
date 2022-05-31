package com.java.techie.pay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.techie.pay.entity.Payment;


public interface PaymentRepo extends JpaRepository<Payment	, Integer> {

	
}
