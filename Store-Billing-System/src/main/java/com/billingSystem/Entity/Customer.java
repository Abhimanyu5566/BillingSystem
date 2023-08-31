package com.billingSystem.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
public class Customer {
	
	@Id
	private int cid;
	private String cphone;
	private String name;
	private String email;
	
	@OneToMany(targetEntity = Invoice.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "CustomerPhoneNo", referencedColumnName = "cphone")
	private List<Invoice> invoices;
	
	
	
	
}
