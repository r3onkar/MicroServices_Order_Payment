package com.java.techie.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.techie.order.entity.Order;


public interface OrderRepo extends JpaRepository<Order, Integer> {

}
