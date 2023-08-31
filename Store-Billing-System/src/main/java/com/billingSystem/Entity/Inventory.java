package com.billingSystem.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String pname;
	private float price;
	private int stock ;
	
	@OneToMany(targetEntity = OrderItems.class, cascade =  CascadeType.ALL)
	@JoinColumn(name = "productId",referencedColumnName = "productId")
	private List<OrderItems> orderItemses;
}
