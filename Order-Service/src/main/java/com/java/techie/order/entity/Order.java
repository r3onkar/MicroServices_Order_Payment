package com.java.techie.order.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data


@Table(name ="odertb")

public class Order {

	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
	
		
}
