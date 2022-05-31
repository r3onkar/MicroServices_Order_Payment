package com.java.techie.pay.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="payDetails")
public class Payment {

	@Id
	@GeneratedValue
	private int	paymentId;
	private String 	paymentStatus;
	private String 	transationId;
	
	
		
	
}
