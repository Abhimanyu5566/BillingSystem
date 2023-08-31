package com.billingSystem.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int InvoiceId;
	
	private String cphone;
	private String cname;
	private String email;
	
	@CreationTimestamp
	private Date date;
	
	
	@OneToMany(targetEntity = OrderItems.class, cascade =  CascadeType.ALL)
	@JoinColumn(name = "InvoiceId", referencedColumnName = "InvoiceId")
	private List<OrderItems> orderItems;
	
	

}
